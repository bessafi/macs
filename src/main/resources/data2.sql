	
	
	/*
	addDrawing  id  cahierid  actionid modifby  modifon  actiondata{type=add  , data:[{number:123, qtt:3, revision:rev, status:red, ..},{},{},{}.....]}
	deletePart  id  cahierid  actionid modifby  modifon  actiondata{type=delete   , data:[{number:123, qtt:3, revision:rev, status:red, ..},{},{},{}.....]}
	updatepart  id  cahierid  actionid modifby  modifon  actiondata{type=update  , data:[{  {field:id, newvalue:23,old:23},
	                                                                                                                 {field:number, newvalue:203,old:203},
	                                                                                                              {field:qtt, newvalue:3,old:3},
	                                                                                                                 {field:revision, newvalue:rev1,old:rev2},
	                                                                                                                 {field:status, newvalue:red,old:green} ..},
	                                                                                                               { {field:id, newvalue:24,old:24},
	                                                                                                                 {field:number, newvalue:223,old:223},
	                                                                                                                 {field:qtt, newvalue:4,old:4},
	                                                                                                                 {field:revision, newvalue:rev5,old:rev7},
                                                                                                                {field:status, newvalue:red,old:green} ..},{},{}.....]}
	*/ 


/*
addDrawing  id  cahierid  actionid modifby  modifon  actiondata{
type=add  , 
data:[{number:123, qtt:3, revision:rev, status:red, ..},{},{},{}.....]}

deletePart  id  cahierid  actionid modifby  modifon  actiondata{
type=delete   , 
data:[{number:123, qtt:3, revision:rev, status:red, ..},{},{},{}.....]}

updatepart  id  cahierid  actionid modifby  modifon  actiondata{
type=update  , 
data:[{  {field:id, newvalue:23,old:23},
                                                                                                                 {field:number, newvalue:203,old:203},
                                                                                                              {field:qtt, newvalue:3,old:3},
                                                                                                                 {field:revision, newvalue:rev1,old:rev2},
                                                                                                                 {field:status, newvalue:red,old:green} ..},
                                                                                                               { {field:id, newvalue:24,old:24},
                                                                                                                 {field:number, newvalue:223,old:223},
                                                                                                                 {field:qtt, newvalue:4,old:4},
                                                                                                                 {field:revision, newvalue:rev5,old:rev7},
                                                                                                            {field:status, newvalue:red,old:green} ..},{},{}.....]}

*
*
*{type:"add|remove|modify", 
*data:(**ifTypeModify**[{field:"", newValue:"", oldValue:""}]|
       **ifTypeaddOrRemove**[{internalId:"", fields:[{name:"", value: ""}]}])}

Alternatively this format could be saved in database directly, will all appropriate fields and tables created
modifiedBy
modifiedOn
Action
id*/







/*INSERT INTO parttype (id,  type) VALUES (1, 'METHOD');
INSERT INTO parttype (id,  type) VALUES (2, 'DASH');
INSERT INTO parttype (id,  type) VALUES (3, 'KIT');
INSERT INTO parttype (id,  type) VALUES (4, 'PHANTOM');
INSERT INTO parttype (id,  type) VALUES (5, 'PAM')
INSERT INTO parttype (ID, date, price)
    VALUES (23, DATE('2013-02-12'), 22.5)
        ON DUPLICATE KEY UPDATE ID = 23;       
INSERT INTO parttype (id,  type) VALUES (1, 'METHOD') ON DUPLICATE KEY UPDATE id = 1; 
INSERT INTO parttype (id,  type) VALUES (2, 'DASH') ON DUPLICATE KEY UPDATE id = 2; 
INSERT INTO parttype (id,  type) VALUES (3, 'KIT') ON DUPLICATE KEY UPDATE id = 3; 
INSERT INTO parttype (id,  type) VALUES (4, 'PHANTOM') ON DUPLICATE KEY UPDATE id = 4; 
INSERT INTO parttype (id,  type) VALUES (5, 'PAM') ON DUPLICATE KEY UPDATE id = 5
([id], [type])     
INSERT INTO parttype ([id], [type]) VALUES (1, 'METHOD') ON  DUPLICATE KEY UPDATE id = 1; 
INSERT INTO parttype ([id], [type]) VALUES (2, 'DASH') ON DUPLICATE KEY UPDATE id = 2; 
INSERT INTO parttype ([id], [type]) VALUES (3, 'KIT') ON DUPLICATE KEY UPDATE id = 3; 
INSERT INTO parttype ([id], [type]) VALUES (4, 'PHANTOM') ON DUPLICATE KEY UPDATE id = 4; 
INSERT INTO parttype ([id], [type]) VALUES (5, 'PAM') ON DUPLICATE KEY UPDATE id = 5  

ALTER TABLE parttype NOCHECK CONSTRAINT ALL;
TRUNCATE TABLE parttype;
ALTER TABLE parttype WITH CHECK CHECK CONSTRAINT ALL;*/


---------------------------------MYSQL-----------------------------
--TRUNCATE TABLE parttype;
--INSERT INTO parttype ([id], [type]) VALUES (1, 'METHOD');  
	----	INSERT INTO parttype ([id], [type]) VALUES (2, 'DASH');  
	--	INSERT INTO parttype ([id], [type]) VALUES (3, 'KIT'); 
	--	INSERT INTO parttype ([id], [type]) VALUES (4, 'PHANTOM'); 
	--	INSERT INTO parttype ([id], [type]) VALUES (5, 'PAM')

TRUNCATE TABLE cahieraction;
INSERT INTO cahieraction (id, type,nameen,namefr) VALUES (1, 'ADD','ADD','ADD');  
INSERT INTO cahieraction (id, type,nameen,namefr) VALUES (2, 'UPDATE','UPDATE','UPDATE');  
INSERT INTO cahieraction (id, type,nameen,namefr) VALUES (3, 'DELETE','DELETE','DELETE')  
	--	INSERT INTO parttype ([id], [type]) VALUES (3, 'KIT'); 
	--	INSERT INTO parttype ([id], [type]) VALUES (4, 'PHANTOM'); 
	--	INSERT INTO parttype ([id], [type]) VALUES (5, 'PAM')


 
 
 
     
-----------------------SQLSERVER----------------------------------     
--IF NOT EXISTS (SELECT * FROM parttype)
--BEGIN
 --   INSERT INTO parttype ([id], [type]) VALUES (1, 'METHOD')  
  --  INSERT INTO parttype ([id], [type]) VALUES (2, 'DASH')  
   -- INSERT INTO parttype ([id], [type]) VALUES (3, 'KIT') 
    --INSERT INTO parttype ([id], [type]) VALUES (4, 'PHANTOM') 
    --INSERT INTO parttype ([id], [type]) VALUES (5, 'PAM') 
--END     
--INSERT SOMETHING ELSE




IF NOT EXISTS (SELECT * FROM parttype)
BEGIN
    INSERT INTO parttype ([id], [type]) VALUES (1, 'METHOD')  
    INSERT INTO parttype ([id], [type]) VALUES (2, 'DASH')  
    INSERT INTO parttype ([id], [type]) VALUES (3, 'KIT') 
    INSERT INTO parttype ([id], [type]) VALUES (4, 'PHANTOM') 
    INSERT INTO parttype ([id], [type]) VALUES (5, 'PAM') 
END ; 


IF NOT EXISTS (SELECT * FROM cahieraction)
BEGIN
   	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (1, 'ADD','ADD','ADD')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (2, 'UPDATE','UPDATE','UPDATE')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (3, 'DELETE','DELETE','DELETE')
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (4, 'DELETE','DELETE','UPDATE_CAHIER')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (5, 'DELETE','DELETE','DELETE_CAHIER')
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (6, 'ADD_TOOL','ADD_TOOL','ADD_TOOL')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (7, 'ADD_DRAWING','ADD_DRAWING','ADD_DRAWING')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (8, 'DELETE_PART','DELETE_PART','DELETE_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (9, 'DELETE_DASH_PART','DELETE_DASH_PART','DELETE_DASH_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (10, 'DELETE_PAM_PART','DELETE_PAM_PART','DELETE_PAM_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (11, 'DELETE_KIT_PART','DELETE_KIT_PART','DELETE_KIT_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (12, 'DELETE_PHANTOM_PART','DELETE_PHANTOM_PART','DELETE_PHANTOM_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (13, 'DELETE_METHOD_PART','DELETE_METHOD_PART','DELETE_METHOD_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (14, 'ADD_PART','ADD_PART','ADD_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (15, 'ADD_DASH_PART','ADD_DASH_PART','ADD_DASH_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (16, 'ADD_PAM_PART','ADD_PAM_PART','ADD_PAM_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (17, 'ADD_KIT_PART','ADD_KIT_PART','ADD_KIT_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (18, 'ADD_PHANTOM_PART','ADD_PHANTOM_PART','ADD_PHANTOM_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (19, 'ADD_METHOD_PART','ADD_METHOD_PART','ADD_METHOD_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (20, 'UPDATE_PART','UPDATE_PART','UPDATE_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (21, 'UPDATE_DASH_PART','UPDATE_DASH_PART','UPDATE_DASH_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (22, 'UPDATE_PAM_PART','UPDATE_PAM_PART','UPDATE_PAM_PART') 
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (23, 'UPDATE_KIT_PART','UPDATE_KIT_PART','UPDATE_KIT_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (24, 'UPDATE_PHANTOM_PART','UPDATE_PHANTOM_PART','UPDATE_PHANTOM_PART')  
	INSERT INTO cahieraction (id,nameen,[namefr], [type]) VALUES (25, 'UPDATE_METHOD_PART','UPDATE_METHOD_PART','UPDATE_METHOD_PART')

    
END ; 











     
