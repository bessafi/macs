
 TRUNCATE TABLE cahieraction;
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (1, 'ADD','ADD','ADD');  
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (2, 'UPDATE','UPDATE','UPDATE');  
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (3, 'DELETE','DELETE','DELETE');
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (4, 'DELETE','DELETE','UPDATE_CAHIER');  
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (5, 'DELETE','DELETE','DELETE_CAHIER') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (6, 'ADD_TOOL','ADD_TOOL','ADD_TOOL') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (7, 'ADD_DRAWING','ADD_DRAWING','ADD_DRAWING') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (8, 'DELETE_PART','DELETE_PART','DELETE_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (9, 'DELETE_DASH_PART','DELETE_DASH_PART','DELETE_DASH_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (10, 'DELETE_PAM_PART','DELETE_PAM_PART','DELETE_PAM_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (11, 'DELETE_KIT_PART','DELETE_KIT_PART','DELETE_KIT_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (12, 'DELETE_PHANTOM_PART','DELETE_PHANTOM_PART','DELETE_PHANTOM_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (13, 'DELETE_METHOD_PART','DELETE_METHOD_PART','DELETE_METHOD_PART') ;  
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (14, 'ADD_PART','ADD_PART','ADD_PART') ;  
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (15, 'ADD_DASH_PART','ADD_DASH_PART','ADD_DASH_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (16, 'ADD_PAM_PART','ADD_PAM_PART','ADD_PAM_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (17, 'ADD_KIT_PART','ADD_KIT_PART','ADD_KIT_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (18, 'ADD_PHANTOM_PART','ADD_PHANTOM_PART','ADD_PHANTOM_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (19, 'ADD_METHOD_PART','ADD_METHOD_PART','ADD_METHOD_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (20, 'UPDATE_PART','UPDATE_PART','UPDATE_PART') ;
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (21, 'UPDATE_DASH_PART','UPDATE_DASH_PART','UPDATE_DASH_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (22, 'UPDATE_PAM_PART','UPDATE_PAM_PART','UPDATE_PAM_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (23, 'UPDATE_KIT_PART','UPDATE_KIT_PART','UPDATE_KIT_PART') ; 
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (24, 'UPDATE_PHANTOM_PART','UPDATE_PHANTOM_PART','UPDATE_PHANTOM_PART')  
INSERT INTO cahieraction (id,nameen,namefr, type) VALUES (25, 'UPDATE_METHOD_PART','UPDATE_METHOD_PART','UPDATE_METHOD_PART')
     
-----------------------Populate  partype table if  is  empty--------------------------   
--IF NOT EXISTS (SELECT * FROM parttype)
--BEGIN
    --INSERT INTO parttype ([id], [type]) VALUES (1, 'METHOD')  
    --INSERT INTO parttype ([id], [type]) VALUES (2, 'DASH')  
    --INSERT INTO parttype ([id], [type]) VALUES (3, 'KIT') 
    --INSERT INTO parttype ([id], [type]) VALUES (4, 'PHANTOM') 
    --INSERT INTO parttype ([id], [type]) VALUES (5, 'PAM') 
--END ;    




