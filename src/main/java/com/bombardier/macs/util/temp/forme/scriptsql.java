package com.bombardier.macs.util.temp.forme;







/**

http://localhost:9080/api/mbom/1809/1809/1809/cahiers/93/part
[
  {
    "parentId": "0000047088",
    "qty": 54,
    "type": "KIT",
    "createdFields": {
    "number": "0000047088child1kit",
    "description": "0000047088child1kit",
    "qty": 198,
    "drawing": "drwg11k",
    "revision": "rev11k"
    },
    "modifiedFields": {
      "numberHistory": [
        "string1111"
      ],
      "descriptionHistory": [
        "string21222"
      ],
      "qtyHistory": [
        0
      ],
      "drawingHistory": [
        "string31233"
      ],
      "revisionHistory": [
        "string44144"
      ]
    },
    "flagMethod": true,
    "flagABCL": true,
    "partList": ["123child1kit","123child2kit"
    ],
    "children": [
      null
    ]
  }
]







http://localhost:9080/api/mbom/999/999/999/cahiers/1/part
[
  {
    "parentId": "0000047088",
    "qty": 54,
    "type": "KIT",
    "createdFields": {
    "number": "toto2kit",
    "description": "toto2ki",
    "qty": 19,
    "drawing": "drwg11k",
    "revision": "rev11k"
    },
    "modifiedFields": {
      "numberHistory": [
        "string11"
      ],
      "descriptionHistory": [
        "string222"
      ],
      "qtyHistory": [
        0
      ],
      "drawingHistory": [
        "string333"
      ],
      "revisionHistory": [
        "string4444"
      ]
    },
    "flagMethod": true,
    "flagABCL": true,
    "partList": ["123child1kit","123child2kit","123child3kit","123child4kit"
    ],
    "children": [
      null
    ]
  }
]







SELECT * FROM bomb_macs5.cahier;



INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1805.0000040580', NULL, N'ECS - MASTER RAL - PROJECT SPECIFIC', NULL, N'http://bdiauthority1/1805.0000040580', N'http://bdiauthority2/1805.0000040580', N'http://bdiauthority3/1805.0000040580', N'http://bdiauthority4/1805.0000040580', N'RAL-BM700-S1043', NULL, 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, NULL, 1165, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1805.0000040585', NULL, N'ECS - MASTER RAL - PROJECT SPECIFIC', NULL, N'http://bdiauthority1/1805.0000040585', N'http://bdiauthority2/1805.0000040585', N'http://bdiauthority3/1805.0000040585', N'http://bdiauthority4/1805.0000040585', N'RAL-BM700-S1043', N'0000040580', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1805.0000040580', 1165, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1805.0000046251', NULL, N'ECS - PRODUCT LEVEL - CABINETS AND BULKHEADS', NULL, N'http://bdiauthority1/1805.0000046251', N'http://bdiauthority2/1805.0000046251', N'http://bdiauthority3/1805.0000046251', N'http://bdiauthority4/1805.0000046251', N'RAL-BP700-S1043', N'0000040585', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, N'2910011-E001-SD', NULL, N'1805.0000040585', 1165, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047073', NULL, N'ECS-PRODUCT LEVEL-CABINETS AND BULKHEADS', NULL, N'http://bdiauthority1/1809.0000047073', N'http://bdiauthority2/1809.0000047073', N'http://bdiauthority3/1809.0000047073', N'http://bdiauthority4/1809.0000047073', N'RAL-BP700-S1045', N'0000047068', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, N'2910011-E001-SD', NULL, NULL, 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047079', NULL, N'TABLE ASSY, DADO MOUNTED', NULL, N'http://bdiauthority1/1809.0000047079', N'http://bdiauthority2/1809.0000047079', N'http://bdiauthority3/1809.0000047079', N'http://bdiauthority4/1809.0000047079', N'G25028846', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047080', NULL, N'TABLE ASSY, DADO MOUNTED', NULL, N'http://bdiauthority1/1809.0000047080', N'http://bdiauthority2/1809.0000047080', N'http://bdiauthority3/1809.0000047080', N'http://bdiauthority4/1809.0000047080', N'G25028846', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047081', NULL, N'TABLE ASSY, CONFERENCE TABLE, ANGLED LH', NULL, N'http://bdiauthority1/1809.0000047081', N'http://bdiauthority2/1809.0000047081', N'http://bdiauthority3/1809.0000047081', N'http://bdiauthority4/1809.0000047081', N'G25028849', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047082', NULL, N'MOLDING INSTL, SQR MTL MOLDING', NULL, N'http://bdiauthority1/1809.0000047082', N'http://bdiauthority2/1809.0000047082', N'http://bdiauthority3/1809.0000047082', N'http://bdiauthority4/1809.0000047082', N'G25028850', N'0000047081', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047081', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047084', NULL, N'TABLE ASSY, CONFERENCE TABLE, ANGLED RH', NULL, N'http://bdiauthority1/1809.0000047084', N'http://bdiauthority2/1809.0000047084', N'http://bdiauthority3/1809.0000047084', N'http://bdiauthority4/1809.0000047084', N'G25028851', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047085', NULL, N'MOLDING INSTL, SQR MTL MOLDING', NULL, N'http://bdiauthority1/1809.0000047085', N'http://bdiauthority2/1809.0000047085', N'http://bdiauthority3/1809.0000047085', N'http://bdiauthority4/1809.0000047085', N'G25028852', N'0000047084', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047084', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047087', NULL, N'EXTENSION ASSY, CONFERENCE TABLE, ANGLED', NULL, N'http://bdiauthority1/1809.0000047087', N'http://bdiauthority2/1809.0000047087', N'http://bdiauthority3/1809.0000047087', N'http://bdiauthority4/1809.0000047087', N'G25028853', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047088', NULL, N'MOLDING INSTL, SQR MTL MOLDING, NO INLAY', NULL, N'http://bdiauthority1/1809.0000047088', N'http://bdiauthority2/1809.0000047088', N'http://bdiauthority3/1809.0000047088', N'http://bdiauthority4/1809.0000047088', N'G25028854', N'0000047087', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047087', 191, NULL, NULL, NULL, NULL, NULL);


SELECT * FROM bomb_macs4.cahierdrawing;


INSERT bomb_macs5.jalon (id, title, workcenter_id) VALUES (1, N'Jalon1', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id) VALUES (2, N'Jalon2', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (3, N'Jalon3', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (4, N'Jalon4', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (61, N'Jalon1', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (62, N'Jalon2', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (63, N'Jalon3', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (64, N'Jalon4', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (65, N'Jalon1', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (66, N'Jalon2', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (67, N'Jalon3', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (68, N'Jalon4', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (69, N'Jalon1', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (70, N'Jalon2', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (71, N'Jalon3', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (72, N'Jalon4', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (73, N'Jalon1', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (74, N'Jalon2', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (75, N'Jalon3', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (76, N'Jalon4', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (77, N'Jalon1', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (78, N'Jalon2', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (79, N'Jalon3', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (80, N'Jalon4', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (81, N'Jalon1', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (82, N'Jalon2', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (83, N'Jalon3', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (84, N'Jalon4', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (85, N'Jalon1', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (86, N'Jalon2', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (87, N'Jalon3', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (88, N'Jalon4', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (89, N'Jalon1', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (90, N'Jalon2', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (91, N'Jalon3', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (92, N'Jalon4', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (93, N'Jalon1', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (94, N'Jalon2', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (95, N'Jalon3', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (96, N'Jalon4', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (97, N'Jalon1', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (98, N'Jalon2', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (99, N'Jalon3', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (100, N'Jalon4', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (101, N'Jalon1', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (102, N'Jalon2', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (103, N'Jalon3', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (104, N'Jalon4', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (105, N'Jalon1', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (106, N'Jalon2', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (107, N'Jalon3', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (108, N'Jalon4', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (109, N'Jalon1', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (110, N'Jalon2', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (111, N'Jalon3', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (112, N'Jalon4', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (113, N'Jalon1', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (114, N'Jalon2', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (115, N'Jalon3', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (116, N'Jalon4', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (117, N'Jalon1', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (118, N'Jalon2', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (119, N'Jalon3', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (120, N'Jalon4', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (121, N'Jalon1', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (122, N'Jalon2', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (123, N'Jalon3', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (124, N'Jalon4', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (125, N'Jalon1', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (126, N'Jalon2', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (127, N'Jalon3', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (128, N'Jalon4', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (129, N'Jalon1', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (130, N'Jalon2', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (131, N'Jalon3', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (132, N'Jalon4', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (133, N'Jalon1', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (134, N'Jalon2', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (135, N'Jalon3', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (136, N'Jalon4', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (137, N'Jalon1', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (138, N'Jalon2', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (139, N'Jalon3', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (140, N'Jalon4', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (141, N'Jalon1', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (142, N'Jalon2', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (143, N'Jalon3', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (144, N'Jalon4', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (145, N'Jalon1', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (146, N'Jalon2', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (147, N'Jalon3', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (148, N'Jalon4', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (149, N'Jalon1', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (150, N'Jalon2', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (151, N'Jalon3', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (152, N'Jalon4', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (153, N'Jalon1', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (154, N'Jalon2', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (155, N'Jalon3', 66);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (156, N'Jalon4', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (157, N'Jalon1', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (158, N'Jalon2', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (159, N'Jalon3', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (160, N'Jalon4', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (161, N'Jalon1', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (162, N'Jalon2', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (163, N'Jalon3', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (164, N'Jalon4', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (165, N'Jalon1', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (166, N'Jalon2', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (167, N'Jalon3', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (168, N'Jalon4', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (169, N'Jalon1', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (170, N'Jalon2', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (171, N'Jalon3', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (172, N'Jalon4', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (173, N'Jalon1', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (174, N'Jalon2', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (175, N'Jalon3', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (176, N'Jalon4', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (177, N'Jalon1', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (178, N'Jalon2', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (179, N'Jalon3', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (180, N'Jalon4', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (181, N'Jalon1', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (182, N'Jalon2', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (183, N'Jalon3', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (184, N'Jalon4', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (185, N'Jalon1', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (186, N'Jalon2', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (187, N'Jalon3', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (188, N'Jalon4', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (189, N'Jalon1', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (190, N'Jalon2', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (191, N'Jalon3', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (192, N'Jalon4', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (193, N'Jalon1', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (194, N'Jalon2', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (195, N'Jalon3', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (196, N'Jalon4', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (197, N'Jalon1', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (198, N'Jalon2', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (199, N'Jalon3', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (200, N'Jalon4', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (201, N'Jalon1', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (202, N'Jalon2', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (203, N'Jalon3', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (204, N'Jalon4', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (205, N'Jalon1', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (206, N'Jalon2', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (207, N'Jalon3', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (208, N'Jalon4', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (209, N'Jalon1', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (210, N'Jalon2', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (211, N'Jalon3', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (212, N'Jalon4', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (213, N'Jalon1', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (214, N'Jalon2', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (215, N'Jalon3', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (216, N'Jalon4', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (217, N'Jalon1', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (218, N'Jalon2', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (219, N'Jalon3', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (220, N'Jalon4', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (221, N'Jalon1', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (222, N'Jalon2', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (223, N'Jalon3', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (224, N'Jalon4', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (225, N'Jalon1', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (226, N'Jalon2', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (227, N'Jalon3', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (228, N'Jalon4', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (229, N'Jalon1', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (230, N'Jalon2', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (231, N'Jalon3', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (232, N'Jalon4', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (342, N'#', 190);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (343, N'#', 191);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (344, N'#', 192);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (345, N'AS_3241_065_Prep_Finition2', 193);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (346, N'#', 194);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (347, N'#', 195);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (348, N'#', 196);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (349, N'#', 197);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (350, N'AS_3351_065_Prep_Finition2', 198);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (351, N'#', 199);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (352, N'AS_3141_056_Placage3', 200);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (353, N'#', 201);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (354, N'#', 202);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (355, N'#', 203);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (356, N'#', 204);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (357, N'#', 205);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (358, N'#', 206);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (359, N'#', 207);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (360, N'#', 208);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (361, N'#', 209);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (362, N'#', 210);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (363, N'#', 211);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (364, N'AS_3218_065_Prep_Finition', 212);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (365, N'#', 213);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (366, N'#', 214);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (367, N'AS_3175_065_Prep_Finition2', 215);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (368, N'AS_3191_065_Prep_Finition2', 216);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (370, N'#', 219);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (371, N'#', 220);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (372, N'#', 221);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (373, N'AS_3241_065_Prep_Finition2', 222);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (374, N'#', 223);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (375, N'#', 224);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (376, N'#', 225);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (377, N'#', 226);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (378, N'AS_3351_065_Prep_Finition2', 227);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (379, N'#', 228);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (380, N'AS_3141_065_Prep_Finition2', 229);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (381, N'#', 230);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (382, N'#', 231);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (383, N'#', 232);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (384, N'#', 233);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (385, N'#', 234);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (386, N'#', 235);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (387, N'#', 236);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (388, N'#', 237);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (389, N'#', 238);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (390, N'#', 239);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (391, N'#', 240);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (392, N'AS_3218_065_Prep_Finition', 241);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (393, N'#', 242);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (394, N'#', 243);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (395, N'AS_3175_065_Prep_Finition2', 244);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (396, N'AS_3191_065_Prep_Finition2', 245);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (397, N'#', 246);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (398, N'#', 247);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (399, N'#', 248);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (400, N'#', 249);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (401, N'AS_3241_065_Prep_Finition2', 250);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (402, N'#', 251);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (403, N'#', 252);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (404, N'#', 253);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (405, N'#', 254);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (406, N'AS_3351_065_Prep_Finition2', 255);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (407, N'#', 256);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (408, N'AS_3141_065_Prep_Finition2', 257);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (409, N'#', 258);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (410, N'#', 259);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (411, N'#', 260);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (412, N'#', 261);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (413, N'#', 262);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (414, N'#', 263);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (415, N'#', 264);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (416, N'#', 265);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (417, N'#', 266);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (418, N'#', 267);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (419, N'#', 268);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (420, N'AS_3218_065_Prep_Finition', 269);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (421, N'#', 270);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (422, N'#', 271);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (423, N'AS_3175_065_Prep_Finition2', 272);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (424, N'AS_3191_065_Prep_Finition2', 273);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (425, N'#', 274);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (426, N'#', 275);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (427, N'#', 276);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (428, N'#', 277);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (429, N'AS_3241_065_Prep_Finition2', 278);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (430, N'#', 279);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (431, N'#', 280);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (432, N'#', 281);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (433, N'#', 282);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (434, N'AS_3351_065_Prep_Finition2', 283);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (435, N'#', 284);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (436, N'AS_3141_065_Prep_Finition2', 285);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (437, N'#', 286);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (438, N'#', 287);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (439, N'#', 288);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (440, N'#', 289);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (441, N'#', 290);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (442, N'#', 291);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (443, N'#', 292);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (444, N'#', 293);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (445, N'#', 294);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (446, N'#', 295);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (447, N'#', 296);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (448, N'AS_3218_065_Prep_Finition', 297);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (449, N'#', 298);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (450, N'#', 299);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (451, N'AS_3175_065_Prep_Finition2', 300);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (452, N'AS_3191_065_Prep_Finition2', 301);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (453, N'#', 302);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (454, N'#', 303);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (455, N'#', 304);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (456, N'#', 305);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (457, N'AS_3241_065_Prep_Finition2', 306);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (458, N'#', 307);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (459, N'#', 308);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (460, N'#', 309);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (461, N'#', 310);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (462, N'AS_3351_065_Prep_Finition2', 311);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (463, N'#', 312);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (464, N'AS_3141_065_Prep_Finition2', 313);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (465, N'#', 314);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (466, N'#', 315);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (467, N'#', 316);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (468, N'#', 317);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (469, N'#', 318);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (470, N'#', 319);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (471, N'#', 320);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (472, N'#', 321);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (473, N'#', 322);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (474, N'#', 323);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (475, N'#', 324);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (476, N'AS_3218_065_Prep_Finition', 325);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (477, N'#', 326);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (478, N'#', 327);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (479, N'AS_3175_065_Prep_Finition2', 328);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (480, N'AS_3191_065_Prep_Finition2', 329);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (481, N'#', 330);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (482, N'#', 331);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (483, N'#', 332);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (484, N'#', 333);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (485, N'AS_3241_065_Prep_Finition2', 334);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (486, N'#', 335);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (487, N'#', 336);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (488, N'#', 337);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (489, N'#', 338);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (490, N'AS_3351_065_Prep_Finition2', 339);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (491, N'#', 340);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (492, N'AS_3141_065_Prep_Finition2', 341);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (493, N'#', 342);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (494, N'#', 343);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (495, N'#', 344);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (496, N'#', 345);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (497, N'#', 346);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (498, N'#', 347);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (499, N'#', 348);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (500, N'#', 349);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (501, N'#', 350);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (502, N'#', 351);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (503, N'#', 352);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (504, N'AS_3218_065_Prep_Finition', 353);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (505, N'#', 354);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (506, N'#', 355);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (507, N'AS_3175_065_Prep_Finition2', 356);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (508, N'AS_3191_065_Prep_Finition2', 357);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (509, N'#', 358);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (510, N'#', 359);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (511, N'#', 360);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (512, N'#', 361);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (513, N'AS_3241_065_Prep_Finition2', 362);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (514, N'#', 363);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (515, N'#', 364);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (516, N'#', 365);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (517, N'#', 366);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (518, N'AS_3351_065_Prep_Finition2', 367);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (519, N'#', 368);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (520, N'AS_3141_065_Prep_Finition2', 369);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (521, N'#', 370);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (522, N'#', 371);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (523, N'#', 372);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (524, N'#', 373);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (525, N'#', 374);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (526, N'#', 375);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (527, N'#', 376);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (528, N'#', 377);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (529, N'#', 378);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (530, N'#', 379);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (531, N'#', 380);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (532, N'AS_3218_065_Prep_Finition', 381);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (533, N'#', 382);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (534, N'#', 383);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (535, N'AS_3175_065_Prep_Finition2', 384);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (536, N'AS_3191_065_Prep_Finition2', 385);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (537, N'#', 386);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (538, N'#', 387);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (539, N'#', 388);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (540, N'#', 389);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (541, N'AS_3241_065_Prep_Finition2', 390);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (542, N'#', 391);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (543, N'#', 392);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (544, N'#', 393);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (545, N'#', 394);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (546, N'AS_3351_065_Prep_Finition2', 395);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (547, N'#', 396);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (548, N'AS_3141_065_Prep_Finition2', 397);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (549, N'#', 398);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (550, N'#', 399);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (551, N'#', 400);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (552, N'#', 401);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (553, N'#', 402);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (554, N'#', 403);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (555, N'#', 404);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (556, N'#', 405);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (557, N'#', 406);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (558, N'#', 407);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (559, N'#', 408);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (560, N'AS_3218_065_Prep_Finition', 409);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (561, N'#', 410);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (562, N'#', 411);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (563, N'AS_3175_065_Prep_Finition2', 412);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (564, N'AS_3191_065_Prep_Finition2', 413);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (565, N'#', 414);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (566, N'#', 415);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (567, N'#', 416);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (568, N'#', 417);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (569, N'AS_3241_065_Prep_Finition2', 418);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (570, N'#', 419);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (571, N'#', 420);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (572, N'#', 421);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (573, N'#', 422);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (574, N'AS_3351_065_Prep_Finition2', 423);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (575, N'#', 424);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (576, N'AS_3141_065_Prep_Finition2', 425);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (577, N'#', 426);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (578, N'#', 427);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (579, N'#', 428);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (580, N'#', 429);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (581, N'#', 430);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (582, N'#', 431);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (583, N'#', 432);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (584, N'#', 433);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (585, N'#', 434);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (586, N'#', 435);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (587, N'#', 436);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (588, N'AS_3218_065_Prep_Finition', 437);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (589, N'#', 438);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (590, N'#', 439);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (591, N'AS_3175_065_Prep_Finition2', 440);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (592, N'AS_3191_065_Prep_Finition2', 441);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (593, N'#', 442);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (594, N'#', 443);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (595, N'#', 444);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (596, N'#', 445);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (597, N'AS_3241_065_Prep_Finition2', 446);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (598, N'#', 447);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (599, N'#', 448);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (600, N'#', 449);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (601, N'#', 450);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (602, N'AS_3351_065_Prep_Finition2', 451);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (603, N'#', 452);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (604, N'AS_3141_065_Prep_Finition2', 453);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (605, N'#', 454);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (606, N'#', 455);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (607, N'#', 456);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (608, N'#', 457);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (609, N'#', 458);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (610, N'#', 459);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (611, N'#', 460);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (612, N'#', 461);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (613, N'#', 462);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (614, N'#', 463);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (615, N'#', 464);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (616, N'AS_3218_065_Prep_Finition', 465);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (617, N'#', 466);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (618, N'#', 467);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (619, N'AS_3175_065_Prep_Finition2', 468);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (620, N'AS_3191_065_Prep_Finition2', 469);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (621, N'#', 470);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (622, N'#', 471);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (623, N'#', 472);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (624, N'#', 473);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (625, N'AS_3241_065_Prep_Finition2', 474);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (626, N'#', 475);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (627, N'#', 476);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (628, N'#', 477);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (629, N'#', 478);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (630, N'AS_3351_065_Prep_Finition2', 479);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (631, N'#', 480);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (632, N'AS_3141_065_Prep_Finition2', 481);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (633, N'#', 482);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (634, N'#', 483);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (635, N'#', 484);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (636, N'#', 485);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (637, N'#', 486);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (638, N'#', 487);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (639, N'#', 488);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (640, N'#', 489);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (641, N'#', 490);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (642, N'#', 491);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (643, N'#', 492);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (644, N'AS_3218_065_Prep_Finition', 493);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (645, N'#', 494);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (646, N'#', 495);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (647, N'AS_3175_065_Prep_Finition2', 496);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (648, N'AS_3191_065_Prep_Finition2', 497);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (649, N'#', 498);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (650, N'#', 499);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (651, N'#', 500);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (652, N'#', 501);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (653, N'AS_3241_065_Prep_Finition2', 502);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (654, N'#', 503);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (655, N'#', 504);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (656, N'#', 505);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (657, N'#', 506);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (658, N'AS_3351_065_Prep_Finition2', 507);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (659, N'#', 508);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (660, N'AS_3141_065_Prep_Finition2', 509);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (661, N'#', 510);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (662, N'#', 511);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (663, N'#', 512);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (664, N'#', 513);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (665, N'#', 514);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (666, N'#', 515);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (667, N'#', 516);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (668, N'#', 517);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (669, N'#', 518);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (670, N'#', 519);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (671, N'#', 520);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (672, N'AS_3218_065_Prep_Finition', 521);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (673, N'#', 522);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (674, N'#', 523);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (675, N'AS_3175_065_Prep_Finition2', 524);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (676, N'AS_3191_065_Prep_Finition2', 525);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (677, N'#', 526);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (678, N'#', 527);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (679, N'#', 528);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (680, N'#', 529);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (681, N'AS_3241_065_Prep_Finition2', 530);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (682, N'#', 531);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (683, N'#', 532);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (684, N'#', 533);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (685, N'#', 534);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (686, N'AS_3351_065_Prep_Finition2', 535);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (687, N'#', 536);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (688, N'AS_3141_065_Prep_Finition2', 537);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (689, N'#', 538);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (690, N'#', 539);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (691, N'#', 540);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (692, N'#', 541);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (693, N'#', 542);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (694, N'#', 543);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (695, N'#', 544);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (696, N'#', 545);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (697, N'#', 546);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (698, N'#', 547);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (699, N'#', 548);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (700, N'AS_3218_065_Prep_Finition', 549);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (701, N'#', 550);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (702, N'#', 551);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (703, N'AS_3175_065_Prep_Finition2', 552);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (704, N'AS_3191_065_Prep_Finition2', 553);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (705, N'#', 554);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (706, N'#', 555);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (707, N'#', 556);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (708, N'#', 557);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (709, N'AS_3241_065_Prep_Finition2', 558);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (710, N'#', 559);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (711, N'#', 560);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (712, N'#', 561);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (713, N'#', 562);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (714, N'AS_3351_065_Prep_Finition2', 563);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (715, N'#', 564);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (716, N'AS_3141_065_Prep_Finition2', 565);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (717, N'#', 566);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (718, N'#', 567);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (719, N'#', 568);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (720, N'#', 569);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (721, N'#', 570);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (722, N'#', 571);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (723, N'#', 572);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (724, N'#', 573);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (725, N'#', 574);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (726, N'#', 575);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (727, N'#', 576);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (728, N'AS_3218_065_Prep_Finition', 577);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (729, N'#', 578);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (730, N'#', 579);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (731, N'AS_3175_065_Prep_Finition2', 580);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (732, N'AS_3191_065_Prep_Finition2', 581);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (733, N'#', 582);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (734, N'#', 583);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (735, N'#', 584);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (736, N'#', 585);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (737, N'AS_3241_065_Prep_Finition2', 586);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (738, N'#', 587);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (739, N'#', 588);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (740, N'#', 589);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (741, N'#', 590);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (742, N'AS_3351_065_Prep_Finition2', 591);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (743, N'#', 592);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (744, N'AS_3141_065_Prep_Finition2', 593);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (745, N'#', 594);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (746, N'#', 595);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (747, N'#', 596);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (748, N'#', 597);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (749, N'#', 598);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (750, N'#', 599);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (751, N'#', 600);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (752, N'#', 601);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (753, N'#', 602);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (754, N'#', 603);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (755, N'#', 604);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (756, N'AS_3218_065_Prep_Finition', 605);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (757, N'#', 606);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (758, N'#', 607);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (759, N'AS_3175_065_Prep_Finition2', 608);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (760, N'AS_3191_065_Prep_Finition2', 609);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (761, N'#', 610);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (762, N'#', 611);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (763, N'#', 612);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (764, N'#', 613);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (765, N'AS_3241_065_Prep_Finition2', 614);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (766, N'#', 615);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (767, N'#', 616);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (768, N'#', 617);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (769, N'#', 618);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (770, N'AS_3351_065_Prep_Finition2', 619);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (771, N'#', 620);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (772, N'AS_3141_065_Prep_Finition2', 621);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (773, N'#', 622);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (774, N'#', 623);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (775, N'#', 624);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (776, N'#', 625);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (777, N'#', 626);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (778, N'#', 627);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (779, N'#', 628);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (780, N'#', 629);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (781, N'#', 630);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (782, N'#', 631);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (783, N'#', 632);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (784, N'AS_3218_065_Prep_Finition', 633);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (785, N'#', 634);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (786, N'#', 635);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (787, N'AS_3175_065_Prep_Finition2', 636);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (788, N'AS_3191_065_Prep_Finition2', 637);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (789, N'#', 638);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (790, N'#', 639);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (791, N'#', 640);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (792, N'#', 641);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (793, N'AS_3241_065_Prep_Finition2', 642);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (794, N'#', 643);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (795, N'#', 644);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (796, N'#', 645);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (797, N'#', 646);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (798, N'AS_3351_065_Prep_Finition2', 647);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (799, N'#', 648);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (800, N'AS_3141_065_Prep_Finition2', 649);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (801, N'#', 650);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (802, N'#', 651);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (803, N'#', 652);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (804, N'#', 653);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (805, N'#', 654);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (806, N'#', 655);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (807, N'#', 656);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (808, N'#', 657);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (809, N'#', 658);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (810, N'#', 659);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (811, N'#', 660);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (812, N'AS_3218_065_Prep_Finition', 661);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (813, N'#', 662);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (814, N'#', 663);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (815, N'AS_3175_065_Prep_Finition2', 664);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (816, N'AS_3191_065_Prep_Finition2', 665);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (817, N'#', 666);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (818, N'#', 667);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (819, N'#', 668);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (820, N'#', 669);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (821, N'AS_3241_065_Prep_Finition2', 670);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (822, N'#', 671);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (823, N'#', 672);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (824, N'#', 673);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (825, N'#', 674);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (826, N'AS_3351_065_Prep_Finition2', 675);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (827, N'#', 676);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (828, N'AS_3141_065_Prep_Finition2', 677);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (829, N'#', 678);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (830, N'#', 679);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (831, N'#', 680);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (832, N'#', 681);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (833, N'#', 682);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (834, N'#', 683);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (835, N'#', 684);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (836, N'#', 685);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (837, N'#', 686);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (838, N'#', 687);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (839, N'#', 688);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (840, N'AS_3218_065_Prep_Finition', 689);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (841, N'#', 690);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (842, N'#', 691);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (843, N'AS_3175_065_Prep_Finition2', 692);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (844, N'AS_3191_065_Prep_Finition2', 693);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (845, N'#', 694);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (846, N'#', 695);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (847, N'#', 696);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (848, N'#', 697);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (849, N'AS_3241_065_Prep_Finition2', 698);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (850, N'#', 699);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (851, N'#', 700);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (852, N'#', 701);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (853, N'#', 702);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (854, N'AS_3351_065_Prep_Finition2', 703);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (855, N'#', 704);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (856, N'AS_3141_065_Prep_Finition2', 705);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (857, N'#', 706);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (858, N'#', 707);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (859, N'#', 708);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (860, N'#', 709);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (861, N'#', 710);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (862, N'#', 711);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (863, N'#', 712);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (864, N'#', 713);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (865, N'#', 714);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (866, N'#', 715);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (867, N'#', 716);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (868, N'AS_3218_065_Prep_Finition', 717);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (869, N'#', 718);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (870, N'#', 719);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (871, N'AS_3175_065_Prep_Finition2', 720);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (872, N'AS_3191_065_Prep_Finition2', 721);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (873, N'#', 722);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (874, N'#', 723);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (875, N'#', 724);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (876, N'#', 725);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (877, N'AS_3241_065_Prep_Finition2', 726);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (878, N'#', 727);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (879, N'#', 728);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (880, N'#', 729);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (881, N'#', 730);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (882, N'AS_3351_065_Prep_Finition2', 731);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (883, N'#', 732);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (884, N'AS_3141_065_Prep_Finition2', 733);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (885, N'#', 734);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (886, N'#', 735);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (887, N'#', 736);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (888, N'#', 737);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (889, N'#', 738);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (890, N'#', 739);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (891, N'#', 740);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (892, N'#', 741);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (893, N'#', 742);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (894, N'#', 743);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (895, N'#', 744);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (896, N'AS_3218_065_Prep_Finition', 745);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (897, N'#', 746);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (898, N'#', 747);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (899, N'AS_3175_065_Prep_Finition2', 748);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (900, N'AS_3191_065_Prep_Finition2', 749);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (901, N'#', 750);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (902, N'#', 751);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (903, N'#', 752);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (904, N'#', 753);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (905, N'AS_3241_065_Prep_Finition2', 754);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (906, N'#', 755);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (907, N'#', 756);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (908, N'#', 757);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (909, N'#', 758);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (910, N'AS_3351_065_Prep_Finition2', 759);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (911, N'#', 760);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (912, N'AS_3141_065_Prep_Finition2', 761);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (913, N'#', 762);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (914, N'#', 763);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (915, N'#', 764);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (916, N'#', 765);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (917, N'#', 766);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (918, N'#', 767);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (919, N'#', 768);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (920, N'#', 769);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (921, N'#', 770);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (922, N'#', 771);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (923, N'#', 772);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (924, N'AS_3218_065_Prep_Finition', 773);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (925, N'#', 774);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (926, N'#', 775);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (927, N'AS_3175_065_Prep_Finition2', 776);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (928, N'AS_3191_065_Prep_Finition2', 777);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (929, N'#', 778);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (930, N'#', 779);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (931, N'#', 780);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (932, N'#', 781);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (933, N'AS_3241_065_Prep_Finition2', 782);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (934, N'#', 783);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (935, N'#', 784);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (936, N'#', 785);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (937, N'#', 786);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (938, N'AS_3351_065_Prep_Finition2', 787);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (939, N'#', 788);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (940, N'AS_3141_065_Prep_Finition2', 789);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (941, N'#', 790);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (942, N'#', 791);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (943, N'#', 792);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (944, N'#', 793);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (945, N'#', 794);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (946, N'#', 795);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (947, N'#', 796);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (948, N'#', 797);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (949, N'#', 798);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (950, N'#', 799);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (951, N'#', 800);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (952, N'AS_3218_065_Prep_Finition', 801);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (953, N'#', 802);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (954, N'#', 803);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (955, N'AS_3175_065_Prep_Finition2', 804);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (956, N'AS_3191_065_Prep_Finition2', 805);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (957, N'#', 806);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (958, N'#', 807);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (959, N'#', 808);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (960, N'#', 809);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (961, N'AS_3241_065_Prep_Finition2', 810);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (962, N'#', 811);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (963, N'#', 812);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (964, N'#', 813);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (965, N'#', 814);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (966, N'AS_3351_065_Prep_Finition2', 815);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (967, N'#', 816);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (968, N'AS_3141_065_Prep_Finition2', 817);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (969, N'#', 818);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (970, N'#', 819);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (971, N'#', 820);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (972, N'#', 821);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (973, N'#', 822);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (974, N'#', 823);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (975, N'#', 824);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (976, N'#', 825);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (977, N'#', 826);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (978, N'#', 827);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (979, N'#', 828);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (980, N'AS_3218_065_Prep_Finition', 829);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (981, N'#', 830);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (982, N'#', 831);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (983, N'AS_3175_065_Prep_Finition2', 832);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (984, N'AS_3191_065_Prep_Finition2', 833);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (985, N'#', 834);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (986, N'#', 835);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (987, N'#', 836);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (988, N'#', 837);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (989, N'AS_3241_065_Prep_Finition2', 838);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (990, N'#', 839);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (991, N'#', 840);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (992, N'#', 841);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (993, N'#', 842);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (994, N'AS_3351_065_Prep_Finition2', 843);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (995, N'#', 844);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (996, N'AS_3141_065_Prep_Finition2', 845);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (997, N'#', 846);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (998, N'#', 847);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (999, N'#', 848);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1000, N'#', 849);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1001, N'#', 850);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1002, N'#', 851);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1003, N'#', 852);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1004, N'#', 853);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1005, N'#', 854);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1006, N'#', 855);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1007, N'#', 856);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1008, N'AS_3218_065_Prep_Finition', 857);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1009, N'#', 858);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1010, N'#', 859);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1011, N'AS_3175_065_Prep_Finition2', 860);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1012, N'AS_3191_065_Prep_Finition2', 861);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1013, N'#', 862);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1014, N'#', 863);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1015, N'#', 864);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1016, N'#', 865);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1017, N'AS_3241_065_Prep_Finition2', 866);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1018, N'#', 867);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1019, N'#', 868);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1020, N'#', 869);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1021, N'#', 870);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1022, N'AS_3351_065_Prep_Finition2', 871);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1023, N'#', 872);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1024, N'AS_3141_065_Prep_Finition2', 873);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1025, N'#', 874);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1026, N'#', 875);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1027, N'#', 876);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1028, N'#', 877);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1029, N'#', 878);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1030, N'#', 879);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1031, N'#', 880);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1032, N'#', 881);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1033, N'#', 882);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1034, N'#', 883);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1035, N'#', 884);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1036, N'AS_3218_065_Prep_Finition', 885);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1037, N'#', 886);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1038, N'#', 887);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1039, N'AS_3175_065_Prep_Finition2', 888);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1040, N'AS_3191_065_Prep_Finition2', 889);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1041, N'#', 890);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1070, N'#', 919);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1071, N'#', 920);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1072, N'#', 921);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1073, N'AS_3241_065_Prep_Finition2', 922);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1074, N'#', 923);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1075, N'#', 924);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1076, N'#', 925);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1077, N'#', 926);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1078, N'AS_3351_065_Prep_Finition2', 927);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1079, N'#', 928);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1080, N'AS_3141_065_Prep_Finition2', 929);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1081, N'#', 930);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1082, N'#', 931);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1083, N'#', 932);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1084, N'#', 933);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1085, N'#', 934);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1086, N'#', 935);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1087, N'#', 936);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1088, N'#', 937);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1089, N'#', 938);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1090, N'#', 939);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1091, N'#', 940);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1092, N'AS_3218_065_Prep_Finition', 941);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1093, N'#', 942);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1094, N'#', 943);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1095, N'AS_3175_065_Prep_Finition2', 944);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1096, N'AS_3191_065_Prep_Finition2', 945);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1097, N'#', 946);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1098, N'#', 947);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1099, N'#', 948);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1100, N'#', 949);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1101, N'AS_3241_065_Prep_Finition2', 950);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1102, N'#', 951);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1103, N'#', 952);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1104, N'#', 953);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1105, N'#', 954);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1106, N'AS_3351_065_Prep_Finition2', 955);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1107, N'#', 956);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1108, N'AS_3141_065_Prep_Finition2', 957);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1109, N'#', 958);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1110, N'#', 959);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1111, N'#', 960);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1112, N'#', 961);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1113, N'#', 962);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1114, N'#', 963);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1115, N'#', 964);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1116, N'#', 965);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1117, N'#', 966);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1118, N'#', 967);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1119, N'#', 968);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1120, N'AS_3218_065_Prep_Finition', 969);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1121, N'#', 970);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1122, N'#', 971);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1123, N'AS_3175_065_Prep_Finition2', 972);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1124, N'AS_3191_065_Prep_Finition2', 973);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1125, N'#', 974);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1126, N'#', 975);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1127, N'#', 976);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1128, N'#', 977);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1129, N'AS_3241_065_Prep_Finition2', 978);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1130, N'#', 979);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1131, N'#', 980);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1132, N'#', 981);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1133, N'#', 982);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1134, N'AS_3351_065_Prep_Finition2', 983);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1135, N'#', 984);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1136, N'AS_3141_065_Prep_Finition2', 985);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1137, N'#', 986);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1138, N'#', 987);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1139, N'#', 988);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1140, N'#', 989);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1141, N'#', 990);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1142, N'#', 991);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1143, N'#', 992);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1144, N'#', 993);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1145, N'#', 994);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1146, N'#', 995);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1147, N'#', 996);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1148, N'AS_3218_065_Prep_Finition', 997);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1149, N'#', 998);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1150, N'#', 999);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1151, N'AS_3175_065_Prep_Finition2', 1000);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1152, N'AS_3191_065_Prep_Finition2', 1001);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1153, N'#', 1002);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1154, N'#', 1003);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1155, N'#', 1004);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1156, N'#', 1005);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1157, N'AS_3241_065_Prep_Finition2', 1006);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1158, N'#', 1007);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1159, N'#', 1008);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1160, N'#', 1009);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1161, N'#', 1010);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1162, N'AS_3351_065_Prep_Finition2', 1011);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1163, N'#', 1012);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1164, N'AS_3141_065_Prep_Finition2', 1013);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1165, N'#', 1014);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1166, N'#', 1015);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1167, N'#', 1016);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1168, N'#', 1017);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1169, N'#', 1018);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1170, N'#', 1019);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1171, N'#', 1020);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1172, N'#', 1021);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1173, N'#', 1022);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1174, N'#', 1023);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1175, N'#', 1024);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1176, N'AS_3218_065_Prep_Finition', 1025);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1177, N'#', 1026);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1178, N'#', 1027);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1179, N'AS_3175_065_Prep_Finition2', 1028);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1180, N'AS_3191_065_Prep_Finition2', 1029);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1181, N'#', 1030);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1182, N'#', 1031);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1183, N'#', 1032);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1184, N'#', 1033);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1185, N'AS_3241_065_Prep_Finition2', 1034);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1186, N'#', 1035);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1187, N'#', 1036);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1188, N'#', 1037);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1189, N'#', 1038);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1190, N'AS_3351_065_Prep_Finition2', 1039);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1191, N'#', 1040);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1192, N'AS_3141_065_Prep_Finition2', 1041);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1193, N'#', 1042);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1194, N'#', 1043);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1195, N'#', 1044);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1196, N'#', 1045);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1197, N'#', 1046);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1198, N'#', 1047);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1199, N'#', 1048);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1200, N'#', 1049);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1201, N'#', 1050);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1202, N'#', 1051);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1203, N'#', 1052);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1204, N'AS_3218_065_Prep_Finition', 1053);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1205, N'#', 1054);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1206, N'#', 1055);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1207, N'AS_3175_065_Prep_Finition2', 1056);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1208, N'AS_3191_065_Prep_Finition2', 1057);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1209, N'#', 1058);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1210, N'#', 1059);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1211, N'#', 1060);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1212, N'#', 1061);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1213, N'AS_3241_065_Prep_Finition2', 1062);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1214, N'#', 1063);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1215, N'#', 1064);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1216, N'#', 1065);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1217, N'#', 1066);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1218, N'AS_3351_065_Prep_Finition2', 1067);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1219, N'#', 1068);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1220, N'AS_3141_065_Prep_Finition2', 1069);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1221, N'#', 1070);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1222, N'#', 1071);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1223, N'#', 1072);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1224, N'#', 1073);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1225, N'#', 1074);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1226, N'#', 1075);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1227, N'#', 1076);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1228, N'#', 1077);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1229, N'#', 1078);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1230, N'#', 1079);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1231, N'#', 1080);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1232, N'AS_3218_065_Prep_Finition', 1081);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1233, N'#', 1082);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1234, N'#', 1083);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1235, N'AS_3175_065_Prep_Finition2', 1084);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1236, N'AS_3191_065_Prep_Finition2', 1085);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1237, N'#', 1086);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1238, N'#', 1087);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1239, N'#', 1088);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1240, N'#', 1089);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1241, N'AS_3241_065_Prep_Finition2', 1090);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1242, N'#', 1091);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1243, N'#', 1092);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1244, N'#', 1093);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1245, N'#', 1094);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1246, N'AS_3351_065_Prep_Finition2', 1095);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1247, N'#', 1096);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1248, N'AS_3141_065_Prep_Finition2', 1097);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1249, N'#', 1098);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1250, N'#', 1099);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1251, N'#', 1100);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1252, N'#', 1101);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1253, N'#', 1102);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1254, N'#', 1103);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1255, N'#', 1104);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1256, N'#', 1105);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1257, N'#', 1106);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1258, N'#', 1107);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1259, N'#', 1108);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1260, N'AS_3218_065_Prep_Finition', 1109);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1261, N'#', 1110);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1262, N'#', 1111);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1263, N'AS_3175_065_Prep_Finition2', 1112);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1264, N'AS_3191_065_Prep_Finition2', 1113);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1265, N'#', 1114);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1266, N'#', 1115);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1267, N'#', 1116);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1268, N'#', 1117);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1269, N'AS_3241_065_Prep_Finition2', 1118);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1270, N'#', 1119);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1271, N'#', 1120);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1272, N'#', 1121);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1273, N'#', 1122);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1274, N'AS_3351_065_Prep_Finition2', 1123);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1275, N'#', 1124);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1276, N'AS_3141_065_Prep_Finition2', 1125);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1277, N'#', 1126);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1278, N'#', 1127);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1279, N'#', 1128);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1280, N'#', 1129);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1281, N'#', 1130);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1282, N'#', 1132);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1283, N'#', 1132);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1284, N'#', 1133);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1285, N'#', 1134);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1286, N'#', 1135);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1287, N'#', 1136);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1288, N'AS_3218_065_Prep_Finition', 1137);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1289, N'#', 1138);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1290, N'#', 1139);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1291, N'AS_3175_065_Prep_Finition2', 1140);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1292, N'AS_3191_065_Prep_Finition2', 1141);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1293, N'#', 1142);








SELECT * FROM bomb_macs5.workcenter;



INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed) VALUES (90, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 1);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed)  VALUES (91, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'215', 0, NULL, NULL, 215, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed) VALUES (92, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed)  VALUES (93, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1234, N'GA1234-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed)  VALUES (94, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 2345, N'GA2345-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed) VALUES (95, 0, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 0, NULL, 1, 0, 0, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed)  VALUES (96, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 3456, N'GA3456-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'191', 0, NULL, NULL, 191, 1);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed)  VALUES (97, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'191', 0, NULL, NULL, 191, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed) VALUES (98, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'191', 0, NULL, NULL, 191, 0);
INSERT bomb_macs5.cahier (id, bflag, cahierduration, description, edl, effectivity, fromboard, infotype_id, jalonid, job_role_id, method_id, name, number, odflag, primary_job_type_qty, product_id, pva, rflag, sec_job_type, sec_job_type_qty, typeid, wcid, wirecut, jalon_id, objectdependency_id, workcenter_id, is_confirmed)  VALUES (99, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'1087', 0, NULL, NULL, 1087, 1);


















INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1, N'1000', N'1000', N'1000', N'workcenter1000', N'1000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (2, N'1000', N'1000', N'2000', N'workcenter2000', N'2000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (3, N'1000', N'2000', N'2000', N'workcenter3000', N'3000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (4, N'1000', N'1000', N'1000', N'workcenter1000', N'1000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (5, N'1000', N'1000', N'2000', N'workcenter2000', N'2000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (6, N'1000', N'2000', N'2000', N'workcenter3000', N'3000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (7, N'999', N'999', N'999', N'Workcenter 1', N'999_1', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (43, N'888', N'888', N'888', N'Workcenter 1', N'888_1', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (44, N'888', N'888', N'888', N'Workcenter 2', N'888_2', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (45, N'888', N'888', N'888', N'Workcenter 3', N'888_3', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (46, N'888', N'888', N'888', N'Workcenter 4', N'888_4', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (47, N'888', N'888', N'888', N'Workcenter 5', N'888_5', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (48, N'888', N'888', N'888', N'Workcenter 6', N'888_6', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (49, N'888', N'888', N'888', N'Workcenter 7', N'888_7', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (50, N'888', N'888', N'888', N'Workcenter 8', N'888_8', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (51, N'888', N'888', N'888', N'Workcenter 9', N'888_9', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (52, N'888', N'888', N'888', N'Workcenter 10', N'888_10', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (53, N'888', N'888', N'888', N'Workcenter 11', N'888_11', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (54, N'888', N'888', N'888', N'Workcenter 12', N'888_12', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (55, N'888', N'888', N'888', N'Workcenter 13', N'888_13', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (56, N'888', N'888', N'888', N'Workcenter 14', N'888_14', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (57, N'888', N'888', N'888', N'Workcenter 15', N'888_15', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (58, N'999', N'999', N'999', N'Workcenter 2', N'999_2', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (59, N'999', N'999', N'999', N'Workcenter 3', N'999_3', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (60, N'999', N'999', N'999', N'Workcenter 4', N'999_4', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (61, N'999', N'999', N'999', N'Workcenter 5', N'999_5', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (62, N'999', N'999', N'999', N'Workcenter 6', N'999_6', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (63, N'999', N'999', N'999', N'Workcenter 7', N'999_7', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (64, N'999', N'999', N'999', N'Workcenter 8', N'999_8', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (65, N'999', N'999', N'999', N'Workcenter 9', N'999_9', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (66, N'999', N'999', N'999', N'Workcenter 10', N'999_10', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (67, N'999', N'999', N'999', N'Workcenter 11', N'999_11', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (68, N'999', N'999', N'999', N'Workcenter 12', N'999_12', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (69, N'999', N'999', N'999', N'Workcenter 13', N'999_13', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (70, N'999', N'999', N'999', N'Workcenter 14', N'999_14', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (71, N'999', N'999', N'999', N'Workcenter 15', N'999_15', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (190, N'1809', N'BP', N'GE1122', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (191, N'1809', N'BP', N'GE1122', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (192, N'1809', N'BP', N'GE1122', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (193, N'1809', N'BP', N'GE1122', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (194, N'1809', N'BP', N'GE1122', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (195, N'1809', N'BP', N'GE1122', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (196, N'1809', N'BP', N'GE1122', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (197, N'1809', N'BP', N'GE1122', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (198, N'1809', N'BP', N'GE1122', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (199, N'1809', N'BP', N'GE1122', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (200, N'1809', N'BP', N'GE1122', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (201, N'1809', N'BP', N'GE1122', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (202, N'1809', N'BP', N'GE1122', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (203, N'1809', N'BP', N'GE1122', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (204, N'1809', N'BP', N'GE1122', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (205, N'1809', N'BP', N'GE1122', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (206, N'1809', N'BP', N'GE1122', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (207, N'1809', N'BP', N'GE1122', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (208, N'1809', N'BP', N'GE1122', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (209, N'1809', N'BP', N'GE1122', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (210, N'1809', N'BP', N'GE1122', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (211, N'1809', N'BP', N'GE1122', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (212, N'1809', N'BP', N'GE1122', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (213, N'1809', N'BP', N'GE1122', N'1041/AME110', N'1041AME10', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (214, N'1809', N'BP', N'GE1122', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (215, N'1809', N'BP', N'GE1122', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (216, N'1809', N'BP', N'GE1122', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (217, N'1809', N'BP', N'GE1122', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (219, N'1600', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (220, N'1600', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (221, N'1600', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (222, N'1600', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (223, N'1600', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (224, N'1600', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (225, N'1600', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (226, N'1600', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (227, N'1600', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (228, N'1600', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (229, N'1600', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (230, N'1600', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (231, N'1600', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (232, N'1600', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (233, N'1600', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (234, N'1600', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (235, N'1600', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (236, N'1600', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (237, N'1600', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (238, N'1600', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (239, N'1600', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (240, N'1600', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (241, N'1600', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (242, N'1600', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (243, N'1600', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (244, N'1600', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (245, N'1600', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (246, N'1600', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (247, N'1600', N'BP', N'GE1122', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (248, N'1600', N'BP', N'GE1122', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (249, N'1600', N'BP', N'GE1122', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (250, N'1600', N'BP', N'GE1122', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (251, N'1600', N'BP', N'GE1122', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (252, N'1600', N'BP', N'GE1122', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (253, N'1600', N'BP', N'GE1122', N'1041/KML110', N'1041KML110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (254, N'1600', N'BP', N'GE1122', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (255, N'1600', N'BP', N'GE1122', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (256, N'1600', N'BP', N'GE1122', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (257, N'1600', N'BP', N'GE1122', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (258, N'1600', N'BP', N'GE1122', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (259, N'1600', N'BP', N'GE1122', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (260, N'1600', N'BP', N'GE1122', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (261, N'1600', N'BP', N'GE1122', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (262, N'1600', N'BP', N'GE1122', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (263, N'1600', N'BP', N'GE1122', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (264, N'1600', N'BP', N'GE1122', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (265, N'1600', N'BP', N'GE1122', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (266, N'1600', N'BP', N'GE1122', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (267, N'1600', N'BP', N'GE1122', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (268, N'1600', N'BP', N'GE1122', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (269, N'1600', N'BP', N'GE1122', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (270, N'1600', N'BP', N'GE1122', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (271, N'1600', N'BP', N'GE1122', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (272, N'1600', N'BP', N'GE1122', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (273, N'1600', N'BP', N'GE1122', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (274, N'1600', N'BP', N'GE1122', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (275, N'1809', N'BP', N'GE1101', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (276, N'1809', N'BP', N'GE1101', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (277, N'1809', N'BP', N'GE1101', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (278, N'1809', N'BP', N'GE1101', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (279, N'1809', N'BP', N'GE1101', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (280, N'1809', N'BP', N'GE1101', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (281, N'1809', N'BP', N'GE1101', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (282, N'1809', N'BP', N'GE1101', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (283, N'1809', N'BP', N'GE1101', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (284, N'1809', N'BP', N'GE1101', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (285, N'1809', N'BP', N'GE1101', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (286, N'1809', N'BP', N'GE1101', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (287, N'1809', N'BP', N'GE1101', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (288, N'1809', N'BP', N'GE1101', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (289, N'1809', N'BP', N'GE1101', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (290, N'1809', N'BP', N'GE1101', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (291, N'1809', N'BP', N'GE1101', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (292, N'1809', N'BP', N'GE1101', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (293, N'1809', N'BP', N'GE1101', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (294, N'1809', N'BP', N'GE1101', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (295, N'1809', N'BP', N'GE1101', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (296, N'1809', N'BP', N'GE1101', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (297, N'1809', N'BP', N'GE1101', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (298, N'1809', N'BP', N'GE1101', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (299, N'1809', N'BP', N'GE1101', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (300, N'1809', N'BP', N'GE1101', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (301, N'1809', N'BP', N'GE1101', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (302, N'1809', N'BP', N'GE1101', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (303, N'1600', N'BV', N'GE1404', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (304, N'1600', N'BV', N'GE1404', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (305, N'1600', N'BV', N'GE1404', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (306, N'1600', N'BV', N'GE1404', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (307, N'1600', N'BV', N'GE1404', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (308, N'1600', N'BV', N'GE1404', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (309, N'1600', N'BV', N'GE1404', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (310, N'1600', N'BV', N'GE1404', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (311, N'1600', N'BV', N'GE1404', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (312, N'1600', N'BV', N'GE1404', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (313, N'1600', N'BV', N'GE1404', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (314, N'1600', N'BV', N'GE1404', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (315, N'1600', N'BV', N'GE1404', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (316, N'1600', N'BV', N'GE1404', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (317, N'1600', N'BV', N'GE1404', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (318, N'1600', N'BV', N'GE1404', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (319, N'1600', N'BV', N'GE1404', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (320, N'1600', N'BV', N'GE1404', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (321, N'1600', N'BV', N'GE1404', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (322, N'1600', N'BV', N'GE1404', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (323, N'1600', N'BV', N'GE1404', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (324, N'1600', N'BV', N'GE1404', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (325, N'1600', N'BV', N'GE1404', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (326, N'1600', N'BV', N'GE1404', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (327, N'1600', N'BV', N'GE1404', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (328, N'1600', N'BV', N'GE1404', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (329, N'1600', N'BV', N'GE1404', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (330, N'1600', N'BV', N'GE1404', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (331, N'1212', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (332, N'1212', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (333, N'1212', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (334, N'1212', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (335, N'1212', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (336, N'1212', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (337, N'1212', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (338, N'1212', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (339, N'1212', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (340, N'1212', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (341, N'1212', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (342, N'1212', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (343, N'1212', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (344, N'1212', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (345, N'1212', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (346, N'1212', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (347, N'1212', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (348, N'1212', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (349, N'1212', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (350, N'1212', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (351, N'1212', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (352, N'1212', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (353, N'1212', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (354, N'1212', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (355, N'1212', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (356, N'1212', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (357, N'1212', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (358, N'1212', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (359, N'1212', N'BI', N'GE3102', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (360, N'1212', N'BI', N'GE3102', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (361, N'1212', N'BI', N'GE3102', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (362, N'1212', N'BI', N'GE3102', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (363, N'1212', N'BI', N'GE3102', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (364, N'1212', N'BI', N'GE3102', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (365, N'1212', N'BI', N'GE3102', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (366, N'1212', N'BI', N'GE3102', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (367, N'1212', N'BI', N'GE3102', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (368, N'1212', N'BI', N'GE3102', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (369, N'1212', N'BI', N'GE3102', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (370, N'1212', N'BI', N'GE3102', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (371, N'1212', N'BI', N'GE3102', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (372, N'1212', N'BI', N'GE3102', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (373, N'1212', N'BI', N'GE3102', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (374, N'1212', N'BI', N'GE3102', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (375, N'1212', N'BI', N'GE3102', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (376, N'1212', N'BI', N'GE3102', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (377, N'1212', N'BI', N'GE3102', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (378, N'1212', N'BI', N'GE3102', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (379, N'1212', N'BI', N'GE3102', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (380, N'1212', N'BI', N'GE3102', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (381, N'1212', N'BI', N'GE3102', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (382, N'1212', N'BI', N'GE3102', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (383, N'1212', N'BI', N'GE3102', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (384, N'1212', N'BI', N'GE3102', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (385, N'1212', N'BI', N'GE3102', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (386, N'1212', N'BI', N'GE3102', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (387, N'1212', N'BV', N'GE1405', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (388, N'1212', N'BV', N'GE1405', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (389, N'1212', N'BV', N'GE1405', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (390, N'1212', N'BV', N'GE1405', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (391, N'1212', N'BV', N'GE1405', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (392, N'1212', N'BV', N'GE1405', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (393, N'1212', N'BV', N'GE1405', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (394, N'1212', N'BV', N'GE1405', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (395, N'1212', N'BV', N'GE1405', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (396, N'1212', N'BV', N'GE1405', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (397, N'1212', N'BV', N'GE1405', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (398, N'1212', N'BV', N'GE1405', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (399, N'1212', N'BV', N'GE1405', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (400, N'1212', N'BV', N'GE1405', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (401, N'1212', N'BV', N'GE1405', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (402, N'1212', N'BV', N'GE1405', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (403, N'1212', N'BV', N'GE1405', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (404, N'1212', N'BV', N'GE1405', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (405, N'1212', N'BV', N'GE1405', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (406, N'1212', N'BV', N'GE1405', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (407, N'1212', N'BV', N'GE1405', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (408, N'1212', N'BV', N'GE1405', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (409, N'1212', N'BV', N'GE1405', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (410, N'1212', N'BV', N'GE1405', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (411, N'1212', N'BV', N'GE1405', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (412, N'1212', N'BV', N'GE1405', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (413, N'1212', N'BV', N'GE1405', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (414, N'1212', N'BV', N'GE1405', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (415, N'1212', N'BN', N'XE7019', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (416, N'1212', N'BN', N'XE7019', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (417, N'1212', N'BN', N'XE7019', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (418, N'1212', N'BN', N'XE7019', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (419, N'1212', N'BN', N'XE7019', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (420, N'1212', N'BN', N'XE7019', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (421, N'1212', N'BN', N'XE7019', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (422, N'1212', N'BN', N'XE7019', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (423, N'1212', N'BN', N'XE7019', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (424, N'1212', N'BN', N'XE7019', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (425, N'1212', N'BN', N'XE7019', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (426, N'1212', N'BN', N'XE7019', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (427, N'1212', N'BN', N'XE7019', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (428, N'1212', N'BN', N'XE7019', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (429, N'1212', N'BN', N'XE7019', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (430, N'1212', N'BN', N'XE7019', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (431, N'1212', N'BN', N'XE7019', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (432, N'1212', N'BN', N'XE7019', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (433, N'1212', N'BN', N'XE7019', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (434, N'1212', N'BN', N'XE7019', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (435, N'1212', N'BN', N'XE7019', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (436, N'1212', N'BN', N'XE7019', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (437, N'1212', N'BN', N'XE7019', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (438, N'1212', N'BN', N'XE7019', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (439, N'1212', N'BN', N'XE7019', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (440, N'1212', N'BN', N'XE7019', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (441, N'1212', N'BN', N'XE7019', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (442, N'1212', N'BN', N'XE7019', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (443, N'1212', N'BV', N'GE1404', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (444, N'1212', N'BV', N'GE1404', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (445, N'1212', N'BV', N'GE1404', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (446, N'1212', N'BV', N'GE1404', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (447, N'1212', N'BV', N'GE1404', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (448, N'1212', N'BV', N'GE1404', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (449, N'1212', N'BV', N'GE1404', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (450, N'1212', N'BV', N'GE1404', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (451, N'1212', N'BV', N'GE1404', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (452, N'1212', N'BV', N'GE1404', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (453, N'1212', N'BV', N'GE1404', N'1041/AMB110', N'1041AMB110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (454, N'1212', N'BV', N'GE1404', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (455, N'1212', N'BV', N'GE1404', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (456, N'1212', N'BV', N'GE1404', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (457, N'1212', N'BV', N'GE1404', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (458, N'1212', N'BV', N'GE1404', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (459, N'1212', N'BV', N'GE1404', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (460, N'1212', N'BV', N'GE1404', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (461, N'1212', N'BV', N'GE1404', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (462, N'1212', N'BV', N'GE1404', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (463, N'1212', N'BV', N'GE1404', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (464, N'1212', N'BV', N'GE1404', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (465, N'1212', N'BV', N'GE1404', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (466, N'1212', N'BV', N'GE1404', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (467, N'1212', N'BV', N'GE1404', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (468, N'1212', N'BV', N'GE1404', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (469, N'1212', N'BV', N'GE1404', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (470, N'1212', N'BV', N'GE1404', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (471, N'1212', N'BI', N'GE3104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (472, N'1212', N'BI', N'GE3104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (473, N'1212', N'BI', N'GE3104', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (474, N'1212', N'BI', N'GE3104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (475, N'1212', N'BI', N'GE3104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (476, N'1212', N'BI', N'GE3104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (477, N'1212', N'BI', N'GE3104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (478, N'1212', N'BI', N'GE3104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (479, N'1212', N'BI', N'GE3104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (480, N'1212', N'BI', N'GE3104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (481, N'1212', N'BI', N'GE3104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (482, N'1212', N'BI', N'GE3104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (483, N'1212', N'BI', N'GE3104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (484, N'1212', N'BI', N'GE3104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (485, N'1212', N'BI', N'GE3104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (486, N'1212', N'BI', N'GE3104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (487, N'1212', N'BI', N'GE3104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (488, N'1212', N'BI', N'GE3104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (489, N'1212', N'BI', N'GE3104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (490, N'1212', N'BI', N'GE3104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (491, N'1212', N'BI', N'GE3104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (492, N'1212', N'BI', N'GE3104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (493, N'1212', N'BI', N'GE3104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (494, N'1212', N'BI', N'GE3104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (495, N'1212', N'BI', N'GE3104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (496, N'1212', N'BI', N'GE3104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (497, N'1212', N'BI', N'GE3104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (498, N'1212', N'BI', N'GE3104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (499, N'1212', N'BI', N'GE3103', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (500, N'1212', N'BI', N'GE3103', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (501, N'1212', N'BI', N'GE3103', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (502, N'1212', N'BI', N'GE3103', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (503, N'1212', N'BI', N'GE3103', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (504, N'1212', N'BI', N'GE3103', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (505, N'1212', N'BI', N'GE3103', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (506, N'1212', N'BI', N'GE3103', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (507, N'1212', N'BI', N'GE3103', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (508, N'1212', N'BI', N'GE3103', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (509, N'1212', N'BI', N'GE3103', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (510, N'1212', N'BI', N'GE3103', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (511, N'1212', N'BI', N'GE3103', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (512, N'1212', N'BI', N'GE3103', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (513, N'1212', N'BI', N'GE3103', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (514, N'1212', N'BI', N'GE3103', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (515, N'1212', N'BI', N'GE3103', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (516, N'1212', N'BI', N'GE3103', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (517, N'1212', N'BI', N'GE3103', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (518, N'1212', N'BI', N'GE3103', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (519, N'1212', N'BI', N'GE3103', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (520, N'1212', N'BI', N'GE3103', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (521, N'1212', N'BI', N'GE3103', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (522, N'1212', N'BI', N'GE3103', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (523, N'1212', N'BI', N'GE3103', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (524, N'1212', N'BI', N'GE3103', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (525, N'1212', N'BI', N'GE3103', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (526, N'1212', N'BI', N'GE3103', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (527, N'1212', N'BN', N'GE9601', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (528, N'1212', N'BN', N'GE9601', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (529, N'1212', N'BN', N'GE9601', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (530, N'1212', N'BN', N'GE9601', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (531, N'1212', N'BN', N'GE9601', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (532, N'1212', N'BN', N'GE9601', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (533, N'1212', N'BN', N'GE9601', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (534, N'1212', N'BN', N'GE9601', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (535, N'1212', N'BN', N'GE9601', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (536, N'1212', N'BN', N'GE9601', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (537, N'1212', N'BN', N'GE9601', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (538, N'1212', N'BN', N'GE9601', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (539, N'1212', N'BN', N'GE9601', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (540, N'1212', N'BN', N'GE9601', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (541, N'1212', N'BN', N'GE9601', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (542, N'1212', N'BN', N'GE9601', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (543, N'1212', N'BN', N'GE9601', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (544, N'1212', N'BN', N'GE9601', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (545, N'1212', N'BN', N'GE9601', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (546, N'1212', N'BN', N'GE9601', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (547, N'1212', N'BN', N'GE9601', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (548, N'1212', N'BN', N'GE9601', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (549, N'1212', N'BN', N'GE9601', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (550, N'1212', N'BN', N'GE9601', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (551, N'1212', N'BN', N'GE9601', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (552, N'1212', N'BN', N'GE9601', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (553, N'1212', N'BN', N'GE9601', N'1041/AMC110', N'1041AMC110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (554, N'1212', N'BN', N'GE9601', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (555, N'1606', N'BI', N'GE3103', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (556, N'1606', N'BI', N'GE3103', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (557, N'1606', N'BI', N'GE3103', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (558, N'1606', N'BI', N'GE3103', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (559, N'1606', N'BI', N'GE3103', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (560, N'1606', N'BI', N'GE3103', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (561, N'1606', N'BI', N'GE3103', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (562, N'1606', N'BI', N'GE3103', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (563, N'1606', N'BI', N'GE3103', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (564, N'1606', N'BI', N'GE3103', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (565, N'1606', N'BI', N'GE3103', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (566, N'1606', N'BI', N'GE3103', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (567, N'1606', N'BI', N'GE3103', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (568, N'1606', N'BI', N'GE3103', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (569, N'1606', N'BI', N'GE3103', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (570, N'1606', N'BI', N'GE3103', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (571, N'1606', N'BI', N'GE3103', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (572, N'1606', N'BI', N'GE3103', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (573, N'1606', N'BI', N'GE3103', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (574, N'1606', N'BI', N'GE3103', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (575, N'1606', N'BI', N'GE3103', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (576, N'1606', N'BI', N'GE3103', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (577, N'1606', N'BI', N'GE3103', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (578, N'1606', N'BI', N'GE3103', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (579, N'1606', N'BI', N'GE3103', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (580, N'1606', N'BI', N'GE3103', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (581, N'1606', N'BI', N'GE3103', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (582, N'1606', N'BI', N'GE3103', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (583, N'1597', N'BI', N'GE3102', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (584, N'1597', N'BI', N'GE3102', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (585, N'1597', N'BI', N'GE3102', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (586, N'1597', N'BI', N'GE3102', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (587, N'1597', N'BI', N'GE3102', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (588, N'1597', N'BI', N'GE3102', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (589, N'1597', N'BI', N'GE3102', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (590, N'1597', N'BI', N'GE3102', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (591, N'1597', N'BI', N'GE3102', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (592, N'1597', N'BI', N'GE3102', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (593, N'1597', N'BI', N'GE3102', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (594, N'1597', N'BI', N'GE3102', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (595, N'1597', N'BI', N'GE3102', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (596, N'1597', N'BI', N'GE3102', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (597, N'1597', N'BI', N'GE3102', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (598, N'1597', N'BI', N'GE3102', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (599, N'1597', N'BI', N'GE3102', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (600, N'1597', N'BI', N'GE3102', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (601, N'1597', N'BI', N'GE3102', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (602, N'1597', N'BI', N'GE3102', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (603, N'1597', N'BI', N'GE3102', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (604, N'1597', N'BI', N'GE3102', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (605, N'1597', N'BI', N'GE3102', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (606, N'1597', N'BI', N'GE3102', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (607, N'1597', N'BI', N'GE3102', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (608, N'1597', N'BI', N'GE3102', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (609, N'1597', N'BI', N'GE3102', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (610, N'1597', N'BI', N'GE3102', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (611, N'1597', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (612, N'1597', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (613, N'1597', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (614, N'1597', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (615, N'1597', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (616, N'1597', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (617, N'1597', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (618, N'1597', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (619, N'1597', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (620, N'1597', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (621, N'1597', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (622, N'1597', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (623, N'1597', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (624, N'1597', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (625, N'1597', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (626, N'1597', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (627, N'1597', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (628, N'1597', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (629, N'1597', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (630, N'1597', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (631, N'1597', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (632, N'1597', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (633, N'1597', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (634, N'1597', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (635, N'1597', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (636, N'1597', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (637, N'1597', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (638, N'1597', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (639, N'1597', N'BI', N'GE3103', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (640, N'1597', N'BI', N'GE3103', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (641, N'1597', N'BI', N'GE3103', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (642, N'1597', N'BI', N'GE3103', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (643, N'1597', N'BI', N'GE3103', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (644, N'1597', N'BI', N'GE3103', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (645, N'1597', N'BI', N'GE3103', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (646, N'1597', N'BI', N'GE3103', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (647, N'1597', N'BI', N'GE3103', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (648, N'1597', N'BI', N'GE3103', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (649, N'1597', N'BI', N'GE3103', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (650, N'1597', N'BI', N'GE3103', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (651, N'1597', N'BI', N'GE3103', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (652, N'1597', N'BI', N'GE3103', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (653, N'1597', N'BI', N'GE3103', N'1041/AMP510', N'1041AMP510', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (654, N'1597', N'BI', N'GE3103', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (655, N'1597', N'BI', N'GE3103', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (656, N'1597', N'BI', N'GE3103', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (657, N'1597', N'BI', N'GE3103', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (658, N'1597', N'BI', N'GE3103', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (659, N'1597', N'BI', N'GE3103', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (660, N'1597', N'BI', N'GE3103', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (661, N'1597', N'BI', N'GE3103', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (662, N'1597', N'BI', N'GE3103', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (663, N'1597', N'BI', N'GE3103', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (664, N'1597', N'BI', N'GE3103', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (665, N'1597', N'BI', N'GE3103', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (666, N'1597', N'BI', N'GE3103', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (667, N'1809', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (668, N'1809', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (669, N'1809', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (670, N'1809', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (671, N'1809', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (672, N'1809', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (673, N'1809', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (674, N'1809', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (675, N'1809', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (676, N'1809', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (677, N'1809', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (678, N'1809', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (679, N'1809', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (680, N'1809', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (681, N'1809', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (682, N'1809', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (683, N'1809', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (684, N'1809', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (685, N'1809', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (686, N'1809', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (687, N'1809', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (688, N'1809', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (689, N'1809', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (690, N'1809', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (691, N'1809', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (692, N'1809', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (693, N'1809', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (694, N'1809', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (695, N'1212', N'BI', N'GE3101', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (696, N'1212', N'BI', N'GE3101', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (697, N'1212', N'BI', N'GE3101', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (698, N'1212', N'BI', N'GE3101', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (699, N'1212', N'BI', N'GE3101', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (700, N'1212', N'BI', N'GE3101', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (701, N'1212', N'BI', N'GE3101', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (702, N'1212', N'BI', N'GE3101', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (703, N'1212', N'BI', N'GE3101', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (704, N'1212', N'BI', N'GE3101', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (705, N'1212', N'BI', N'GE3101', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (706, N'1212', N'BI', N'GE3101', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (707, N'1212', N'BI', N'GE3101', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (708, N'1212', N'BI', N'GE3101', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (709, N'1212', N'BI', N'GE3101', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (710, N'1212', N'BI', N'GE3101', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (711, N'1212', N'BI', N'GE3101', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (712, N'1212', N'BI', N'GE3101', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (713, N'1212', N'BI', N'GE3101', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (714, N'1212', N'BI', N'GE3101', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (715, N'1212', N'BI', N'GE3101', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (716, N'1212', N'BI', N'GE3101', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (717, N'1212', N'BI', N'GE3101', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (718, N'1212', N'BI', N'GE3101', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (719, N'1212', N'BI', N'GE3101', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (720, N'1212', N'BI', N'GE3101', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (721, N'1212', N'BI', N'GE3101', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (722, N'1212', N'BI', N'GE3101', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (723, N'1212', N'BV', N'GE1402', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (724, N'1212', N'BV', N'GE1402', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (725, N'1212', N'BV', N'GE1402', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (726, N'1212', N'BV', N'GE1402', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (727, N'1212', N'BV', N'GE1402', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (728, N'1212', N'BV', N'GE1402', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (729, N'1212', N'BV', N'GE1402', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (730, N'1212', N'BV', N'GE1402', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (731, N'1212', N'BV', N'GE1402', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (732, N'1212', N'BV', N'GE1402', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (733, N'1212', N'BV', N'GE1402', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (734, N'1212', N'BV', N'GE1402', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (735, N'1212', N'BV', N'GE1402', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (736, N'1212', N'BV', N'GE1402', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (737, N'1212', N'BV', N'GE1402', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (738, N'1212', N'BV', N'GE1402', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (739, N'1212', N'BV', N'GE1402', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (740, N'1212', N'BV', N'GE1402', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (741, N'1212', N'BV', N'GE1402', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (742, N'1212', N'BV', N'GE1402', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (743, N'1212', N'BV', N'GE1402', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (744, N'1212', N'BV', N'GE1402', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (745, N'1212', N'BV', N'GE1402', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (746, N'1212', N'BV', N'GE1402', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (747, N'1212', N'BV', N'GE1402', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (748, N'1212', N'BV', N'GE1402', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (749, N'1212', N'BV', N'GE1402', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (750, N'1212', N'BV', N'GE1402', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (751, N'1594', N'BP', N'GE1104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (752, N'1594', N'BP', N'GE1104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (753, N'1594', N'BP', N'GE1104', N'1041/AMB510', N'1041AMB510', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (754, N'1594', N'BP', N'GE1104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (755, N'1594', N'BP', N'GE1104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (756, N'1594', N'BP', N'GE1104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (757, N'1594', N'BP', N'GE1104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (758, N'1594', N'BP', N'GE1104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (759, N'1594', N'BP', N'GE1104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (760, N'1594', N'BP', N'GE1104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (761, N'1594', N'BP', N'GE1104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (762, N'1594', N'BP', N'GE1104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (763, N'1594', N'BP', N'GE1104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (764, N'1594', N'BP', N'GE1104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (765, N'1594', N'BP', N'GE1104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (766, N'1594', N'BP', N'GE1104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (767, N'1594', N'BP', N'GE1104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (768, N'1594', N'BP', N'GE1104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (769, N'1594', N'BP', N'GE1104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (770, N'1594', N'BP', N'GE1104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (771, N'1594', N'BP', N'GE1104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (772, N'1594', N'BP', N'GE1104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (773, N'1594', N'BP', N'GE1104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (774, N'1594', N'BP', N'GE1104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (775, N'1594', N'BP', N'GE1104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (776, N'1594', N'BP', N'GE1104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (777, N'1594', N'BP', N'GE1104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (778, N'1594', N'BP', N'GE1104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (779, N'1783', N'BP', N'GE1104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (780, N'1783', N'BP', N'GE1104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (781, N'1783', N'BP', N'GE1104', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (782, N'1783', N'BP', N'GE1104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (783, N'1783', N'BP', N'GE1104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (784, N'1783', N'BP', N'GE1104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (785, N'1783', N'BP', N'GE1104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (786, N'1783', N'BP', N'GE1104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (787, N'1783', N'BP', N'GE1104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (788, N'1783', N'BP', N'GE1104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (789, N'1783', N'BP', N'GE1104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (790, N'1783', N'BP', N'GE1104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (791, N'1783', N'BP', N'GE1104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (792, N'1783', N'BP', N'GE1104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (793, N'1783', N'BP', N'GE1104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (794, N'1783', N'BP', N'GE1104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (795, N'1783', N'BP', N'GE1104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (796, N'1783', N'BP', N'GE1104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (797, N'1783', N'BP', N'GE1104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (798, N'1783', N'BP', N'GE1104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (799, N'1783', N'BP', N'GE1104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (800, N'1783', N'BP', N'GE1104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (801, N'1783', N'BP', N'GE1104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (802, N'1783', N'BP', N'GE1104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (803, N'1783', N'BP', N'GE1104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (804, N'1783', N'BP', N'GE1104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (805, N'1783', N'BP', N'GE1104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (806, N'1783', N'BP', N'GE1104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (807, N'1783', N'BP', N'GE1112', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (808, N'1783', N'BP', N'GE1112', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (809, N'1783', N'BP', N'GE1112', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (810, N'1783', N'BP', N'GE1112', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (811, N'1783', N'BP', N'GE1112', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (812, N'1783', N'BP', N'GE1112', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (813, N'1783', N'BP', N'GE1112', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (814, N'1783', N'BP', N'GE1112', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (815, N'1783', N'BP', N'GE1112', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (816, N'1783', N'BP', N'GE1112', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (817, N'1783', N'BP', N'GE1112', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (818, N'1783', N'BP', N'GE1112', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (819, N'1783', N'BP', N'GE1112', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (820, N'1783', N'BP', N'GE1112', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (821, N'1783', N'BP', N'GE1112', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (822, N'1783', N'BP', N'GE1112', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (823, N'1783', N'BP', N'GE1112', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (824, N'1783', N'BP', N'GE1112', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (825, N'1783', N'BP', N'GE1112', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (826, N'1783', N'BP', N'GE1112', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (827, N'1783', N'BP', N'GE1112', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (828, N'1783', N'BP', N'GE1112', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (829, N'1783', N'BP', N'GE1112', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (830, N'1783', N'BP', N'GE1112', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (831, N'1783', N'BP', N'GE1112', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (832, N'1783', N'BP', N'GE1112', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (833, N'1783', N'BP', N'GE1112', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (834, N'1783', N'BP', N'GE1112', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (835, N'1633', N'BP', N'GE1112', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (836, N'1633', N'BP', N'GE1112', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (837, N'1633', N'BP', N'GE1112', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (838, N'1633', N'BP', N'GE1112', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (839, N'1633', N'BP', N'GE1112', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (840, N'1633', N'BP', N'GE1112', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (841, N'1633', N'BP', N'GE1112', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (842, N'1633', N'BP', N'GE1112', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (843, N'1633', N'BP', N'GE1112', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (844, N'1633', N'BP', N'GE1112', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (845, N'1633', N'BP', N'GE1112', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (846, N'1633', N'BP', N'GE1112', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (847, N'1633', N'BP', N'GE1112', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (848, N'1633', N'BP', N'GE1112', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (849, N'1633', N'BP', N'GE1112', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (850, N'1633', N'BP', N'GE1112', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (851, N'1633', N'BP', N'GE1112', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (852, N'1633', N'BP', N'GE1112', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (853, N'1633', N'BP', N'GE1112', N'1041/AMA710', N'1041AMA710', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (854, N'1633', N'BP', N'GE1112', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (855, N'1633', N'BP', N'GE1112', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (856, N'1633', N'BP', N'GE1112', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (857, N'1633', N'BP', N'GE1112', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (858, N'1633', N'BP', N'GE1112', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (859, N'1633', N'BP', N'GE1112', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (860, N'1633', N'BP', N'GE1112', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (861, N'1633', N'BP', N'GE1112', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (862, N'1633', N'BP', N'GE1112', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (863, N'1212', N'BI', N'GE3105', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (864, N'1212', N'BI', N'GE3105', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (865, N'1212', N'BI', N'GE3105', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (866, N'1212', N'BI', N'GE3105', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (867, N'1212', N'BI', N'GE3105', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (868, N'1212', N'BI', N'GE3105', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (869, N'1212', N'BI', N'GE3105', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (870, N'1212', N'BI', N'GE3105', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (871, N'1212', N'BI', N'GE3105', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (872, N'1212', N'BI', N'GE3105', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (873, N'1212', N'BI', N'GE3105', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (874, N'1212', N'BI', N'GE3105', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (875, N'1212', N'BI', N'GE3105', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (876, N'1212', N'BI', N'GE3105', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (877, N'1212', N'BI', N'GE3105', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (878, N'1212', N'BI', N'GE3105', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (879, N'1212', N'BI', N'GE3105', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (880, N'1212', N'BI', N'GE3105', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (881, N'1212', N'BI', N'GE3105', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (882, N'1212', N'BI', N'GE3105', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (883, N'1212', N'BI', N'GE3105', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (884, N'1212', N'BI', N'GE3105', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (885, N'1212', N'BI', N'GE3105', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (886, N'1212', N'BI', N'GE3105', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (887, N'1212', N'BI', N'GE3105', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (888, N'1212', N'BI', N'GE3105', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (889, N'1212', N'BI', N'GE3105', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (890, N'1212', N'BI', N'GE3105', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (919, N'1600', N'BV', N'GE1402', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (920, N'1600', N'BV', N'GE1402', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (921, N'1600', N'BV', N'GE1402', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (922, N'1600', N'BV', N'GE1402', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (923, N'1600', N'BV', N'GE1402', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (924, N'1600', N'BV', N'GE1402', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (925, N'1600', N'BV', N'GE1402', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (926, N'1600', N'BV', N'GE1402', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (927, N'1600', N'BV', N'GE1402', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (928, N'1600', N'BV', N'GE1402', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (929, N'1600', N'BV', N'GE1402', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (930, N'1600', N'BV', N'GE1402', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (931, N'1600', N'BV', N'GE1402', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (932, N'1600', N'BV', N'GE1402', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (933, N'1600', N'BV', N'GE1402', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (934, N'1600', N'BV', N'GE1402', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (935, N'1600', N'BV', N'GE1402', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (936, N'1600', N'BV', N'GE1402', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (937, N'1600', N'BV', N'GE1402', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (938, N'1600', N'BV', N'GE1402', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (939, N'1600', N'BV', N'GE1402', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (940, N'1600', N'BV', N'GE1402', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (941, N'1600', N'BV', N'GE1402', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (942, N'1600', N'BV', N'GE1402', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (943, N'1600', N'BV', N'GE1402', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (944, N'1600', N'BV', N'GE1402', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (945, N'1600', N'BV', N'GE1402', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (946, N'1600', N'BV', N'GE1402', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (947, N'1784', N'BP', N'GE1112', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (948, N'1784', N'BP', N'GE1112', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (949, N'1784', N'BP', N'GE1112', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (950, N'1784', N'BP', N'GE1112', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (951, N'1784', N'BP', N'GE1112', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (952, N'1784', N'BP', N'GE1112', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (953, N'1784', N'BP', N'GE1112', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (954, N'1784', N'BP', N'GE1112', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (955, N'1784', N'BP', N'GE1112', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (956, N'1784', N'BP', N'GE1112', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (957, N'1784', N'BP', N'GE1112', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (958, N'1784', N'BP', N'GE1112', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (959, N'1784', N'BP', N'GE1112', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (960, N'1784', N'BP', N'GE1112', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (961, N'1784', N'BP', N'GE1112', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (962, N'1784', N'BP', N'GE1112', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (963, N'1784', N'BP', N'GE1112', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (964, N'1784', N'BP', N'GE1112', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (965, N'1784', N'BP', N'GE1112', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (966, N'1784', N'BP', N'GE1112', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (967, N'1784', N'BP', N'GE1112', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (968, N'1784', N'BP', N'GE1112', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (969, N'1784', N'BP', N'GE1112', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (970, N'1784', N'BP', N'GE1112', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (971, N'1784', N'BP', N'GE1112', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (972, N'1784', N'BP', N'GE1112', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (973, N'1784', N'BP', N'GE1112', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (974, N'1784', N'BP', N'GE1112', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (975, N'1784', N'BP', N'GE1109', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (976, N'1784', N'BP', N'GE1109', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (977, N'1784', N'BP', N'GE1109', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (978, N'1784', N'BP', N'GE1109', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (979, N'1784', N'BP', N'GE1109', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (980, N'1784', N'BP', N'GE1109', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (981, N'1784', N'BP', N'GE1109', N'1041/KML110', N'1041KML110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (982, N'1784', N'BP', N'GE1109', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (983, N'1784', N'BP', N'GE1109', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (984, N'1784', N'BP', N'GE1109', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (985, N'1784', N'BP', N'GE1109', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (986, N'1784', N'BP', N'GE1109', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (987, N'1784', N'BP', N'GE1109', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (988, N'1784', N'BP', N'GE1109', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (989, N'1784', N'BP', N'GE1109', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (990, N'1784', N'BP', N'GE1109', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (991, N'1784', N'BP', N'GE1109', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (992, N'1784', N'BP', N'GE1109', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (993, N'1784', N'BP', N'GE1109', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (994, N'1784', N'BP', N'GE1109', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (995, N'1784', N'BP', N'GE1109', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (996, N'1784', N'BP', N'GE1109', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (997, N'1784', N'BP', N'GE1109', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (998, N'1784', N'BP', N'GE1109', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (999, N'1784', N'BP', N'GE1109', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1000, N'1784', N'BP', N'GE1109', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1001, N'1784', N'BP', N'GE1109', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1002, N'1784', N'BP', N'GE1109', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1003, N'1784', N'BP', N'GE1132', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1004, N'1784', N'BP', N'GE1132', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1005, N'1784', N'BP', N'GE1132', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1006, N'1784', N'BP', N'GE1132', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1007, N'1784', N'BP', N'GE1132', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1008, N'1784', N'BP', N'GE1132', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1009, N'1784', N'BP', N'GE1132', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1010, N'1784', N'BP', N'GE1132', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1011, N'1784', N'BP', N'GE1132', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1012, N'1784', N'BP', N'GE1132', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1013, N'1784', N'BP', N'GE1132', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1014, N'1784', N'BP', N'GE1132', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1015, N'1784', N'BP', N'GE1132', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1016, N'1784', N'BP', N'GE1132', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1017, N'1784', N'BP', N'GE1132', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1018, N'1784', N'BP', N'GE1132', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1019, N'1784', N'BP', N'GE1132', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1020, N'1784', N'BP', N'GE1132', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1021, N'1784', N'BP', N'GE1132', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1022, N'1784', N'BP', N'GE1132', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1023, N'1784', N'BP', N'GE1132', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1024, N'1784', N'BP', N'GE1132', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1025, N'1784', N'BP', N'GE1132', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1026, N'1784', N'BP', N'GE1132', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1027, N'1784', N'BP', N'GE1132', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1028, N'1784', N'BP', N'GE1132', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1029, N'1784', N'BP', N'GE1132', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1030, N'1784', N'BP', N'GE1132', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1031, N'1269', N'BP', N'GE1104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1032, N'1269', N'BP', N'GE1104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1033, N'1269', N'BP', N'GE1104', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1034, N'1269', N'BP', N'GE1104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1035, N'1269', N'BP', N'GE1104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1036, N'1269', N'BP', N'GE1104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1037, N'1269', N'BP', N'GE1104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1038, N'1269', N'BP', N'GE1104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1039, N'1269', N'BP', N'GE1104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1040, N'1269', N'BP', N'GE1104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1041, N'1269', N'BP', N'GE1104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1042, N'1269', N'BP', N'GE1104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1043, N'1269', N'BP', N'GE1104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1044, N'1269', N'BP', N'GE1104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1045, N'1269', N'BP', N'GE1104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1046, N'1269', N'BP', N'GE1104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1047, N'1269', N'BP', N'GE1104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1048, N'1269', N'BP', N'GE1104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1049, N'1269', N'BP', N'GE1104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1050, N'1269', N'BP', N'GE1104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1051, N'1269', N'BP', N'GE1104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1052, N'1269', N'BP', N'GE1104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1053, N'1269', N'BP', N'GE1104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1054, N'1269', N'BP', N'GE1104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1055, N'1269', N'BP', N'GE1104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1056, N'1269', N'BP', N'GE1104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1057, N'1269', N'BP', N'GE1104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1058, N'1269', N'BP', N'GE1104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1059, N'1212', N'BQ', N'GE1302', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1060, N'1212', N'BQ', N'GE1302', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1061, N'1212', N'BQ', N'GE1302', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1062, N'1212', N'BQ', N'GE1302', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1063, N'1212', N'BQ', N'GE1302', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1064, N'1212', N'BQ', N'GE1302', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1065, N'1212', N'BQ', N'GE1302', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1066, N'1212', N'BQ', N'GE1302', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1067, N'1212', N'BQ', N'GE1302', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1068, N'1212', N'BQ', N'GE1302', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1069, N'1212', N'BQ', N'GE1302', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1070, N'1212', N'BQ', N'GE1302', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1071, N'1212', N'BQ', N'GE1302', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1072, N'1212', N'BQ', N'GE1302', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1073, N'1212', N'BQ', N'GE1302', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1074, N'1212', N'BQ', N'GE1302', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1075, N'1212', N'BQ', N'GE1302', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1076, N'1212', N'BQ', N'GE1302', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1077, N'1212', N'BQ', N'GE1302', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1078, N'1212', N'BQ', N'GE1302', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1079, N'1212', N'BQ', N'GE1302', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1080, N'1212', N'BQ', N'GE1302', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1081, N'1212', N'BQ', N'GE1302', N'1041/AMG110', N'1041AMG110', 1);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1082, N'1212', N'BQ', N'GE1302', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1083, N'1212', N'BQ', N'GE1302', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1084, N'1212', N'BQ', N'GE1302', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1085, N'1212', N'BQ', N'GE1302', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1086, N'1212', N'BQ', N'GE1302', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1087, N'1805', N'BP', N'GE1138', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1088, N'1805', N'BP', N'GE1138', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1089, N'1805', N'BP', N'GE1138', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1090, N'1805', N'BP', N'GE1138', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1091, N'1805', N'BP', N'GE1138', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1092, N'1805', N'BP', N'GE1138', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1093, N'1805', N'BP', N'GE1138', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1094, N'1805', N'BP', N'GE1138', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1095, N'1805', N'BP', N'GE1138', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1096, N'1805', N'BP', N'GE1138', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1097, N'1805', N'BP', N'GE1138', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1098, N'1805', N'BP', N'GE1138', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1099, N'1805', N'BP', N'GE1138', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1100, N'1805', N'BP', N'GE1138', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1101, N'1805', N'BP', N'GE1138', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1102, N'1805', N'BP', N'GE1138', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1103, N'1805', N'BP', N'GE1138', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1104, N'1805', N'BP', N'GE1138', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1105, N'1805', N'BP', N'GE1138', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1106, N'1805', N'BP', N'GE1138', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1107, N'1805', N'BP', N'GE1138', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1108, N'1805', N'BP', N'GE1138', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1109, N'1805', N'BP', N'GE1138', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1110, N'1805', N'BP', N'GE1138', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1111, N'1805', N'BP', N'GE1138', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1112, N'1805', N'BP', N'GE1138', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1113, N'1805', N'BP', N'GE1138', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1114, N'1805', N'BP', N'GE1138', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1115, N'1805', N'BP', N'GE1136', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1116, N'1805', N'BP', N'GE1136', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1117, N'1805', N'BP', N'GE1136', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1118, N'1805', N'BP', N'GE1136', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1119, N'1805', N'BP', N'GE1136', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1120, N'1805', N'BP', N'GE1136', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1121, N'1805', N'BP', N'GE1136', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1122, N'1805', N'BP', N'GE1136', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1123, N'1805', N'BP', N'GE1136', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1124, N'1805', N'BP', N'GE1136', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1125, N'1805', N'BP', N'GE1136', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1126, N'1805', N'BP', N'GE1136', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1127, N'1805', N'BP', N'GE1136', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1128, N'1805', N'BP', N'GE1136', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1129, N'1805', N'BP', N'GE1136', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1130, N'1805', N'BP', N'GE1136', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1131, N'1805', N'BP', N'GE1136', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1132, N'1805', N'BP', N'GE1136', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1133, N'1805', N'BP', N'GE1136', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1134, N'1805', N'BP', N'GE1136', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1135, N'1805', N'BP', N'GE1136', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1136, N'1805', N'BP', N'GE1136', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1137, N'1805', N'BP', N'GE1136', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1138, N'1805', N'BP', N'GE1136', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1139, N'1805', N'BP', N'GE1136', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1140, N'1805', N'BP', N'GE1136', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1141, N'1805', N'BP', N'GE1136', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1142, N'1805', N'BP', N'GE1136', N'1041/AMK110', N'1041AMK110', 0);





/*SELECT * FROM bomb_macs5.jalon;

INSERT bomb_macs5.jalon (id, title, workcenter_id) VALUES (1, N'Jalon1', 7);


INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1, N'1000', N'1000', N'1000', N'workcenter1000', N'1000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (2, N'1000', N'1000', N'2000', N'workcenter2000', N'2000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (3, N'1000', N'2000', N'2000', N'workcenter3000', N'3000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (4, N'1000', N'1000', N'1000', N'workcenter1000', N'1000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (5, N'1000', N'1000', N'2000', N'workcenter2000', N'2000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (6, N'1000', N'2000', N'2000', N'workcenter3000', N'3000', NULL);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (7, N'999', N'999', N'999', N'Workcenter 1', N'999_1', NULL);





































USE [MBOMG78]
GO
**** Object:  Table [dbo].[backend_ui_mapping]    Script Date: 2017-10-23 13:04:40 ******
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[backend_ui_mapping](
	[back_end_code] [varchar](255) NOT NULL,
	[uid_code] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[back_end_code] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
***** Object:  Table [dbo].[cahier]    Script Date: 2017-10-23 13:04:40 ******
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[cahier](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[bflag] [bit] NULL,
	[cahierduration] [varchar](255) NULL,
	[description] [varchar](255) NULL,
	[edl] [bit] NULL,
	[effectivity] [varchar](255) NULL,
	[fromboard] [bit] NULL,
	[infotype_id] [bigint] NULL,
	[jalonid] [bigint] NULL,
	[job_role_id] [bigint] NULL,
	[method_id] [bigint] NULL,
	[name] [varchar](255) NULL,
	[number] [bigint] NULL,
	[odflag] [bit] NULL,
	[primary_job_type_qty] [bigint] NULL,
	[product_id] [bigint] NULL,
	[pva] [bit] NULL,
	[rflag] [bit] NULL,
	[sec_job_type] [bigint] NULL,
	[sec_job_type_qty] [bigint] NULL,
	[typeid] [bigint] NULL,
	[wcid] [varchar](255) NULL,
	[wirecut] [bit] NULL,
	[jalon_id] [bigint] NULL,
	[objectdependency_id] [bigint] NULL,
	[workcenter_id] [bigint] NULL,
	[is_confirmed] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
***** Object:  Table [dbo].[cahierdrawing]    Script Date: 2017-10-23 13:04:40 ******
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[cahierdrawing](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[effectivity] [varchar](255) NULL,
	[flagabcl] [bit] NULL,
	[flagmethod] [bit] NULL,
	[number] [varchar](255) NULL,
	[revision] [varchar](255) NULL,
	[cahier_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[cahiertool]    Script Date: 2017-10-23 13:04:40 ******
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[cahiertool](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[description] [varchar](255) NULL,
	[flagabcl] [bit] NULL,
	[flagmethod] [bit] NULL,
	[number] [varchar](255) NULL,
	[cahier_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
***** Object:  Table [dbo].[cahierupdatedpart]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[cahierupdatedpart](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[description] [varchar](255) NULL,
	[drawing] [varchar](255) NULL,
	[number] [varchar](255) NULL,
	[qty] [int] NULL,
	[revision] [varchar](255) NULL,
	[part_id] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
****** Object:  Table [dbo].[dda]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dda](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[cahier_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[drawing]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[drawing](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[cahier_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[jalon]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jalon](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[title] [varchar](255) NULL,
	[workcenter_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[masterpart]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[masterpart](
	[id] [varchar](255) NOT NULL,
	[authority] [varchar](255) NULL,
	[cahierid] [bigint] NULL,
	[ci] [varchar](255) NULL,
	[description] [varchar](255) NULL,
	[drawing] [varchar](255) NULL,
	[lnk_drw_rclk] [varchar](255) NULL,
	[lnk_nbr_rclk] [varchar](255) NULL,
	[lnk_rev_rclk] [varchar](255) NULL,
	[lnk_str_rclk] [varchar](255) NULL,
	[number] [varchar](255) NULL,
	[parentid] [varchar](255) NULL,
	[part_nbr] [bigint] NULL,
	[qty] [int] NULL,
	[revision] [varchar](255) NULL,
	[status_drw_assgn] [varchar](255) NULL,
	[status_nbr_assgn] [varchar](255) NULL,
	[status_rev_assgn] [varchar](255) NULL,
	[status_str_assgn] [varchar](255) NULL,
	[string] [varchar](255) NULL,
	[type] [varchar](255) NULL,
	[cahier_id] [bigint] NULL,
	[parent_id] [varchar](255) NULL,
	[workcenter_id] [bigint] NULL,
	[project] [varchar](255) NULL,
	[sector] [varchar](255) NULL,
	[sub_sector] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[objectdependency]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[objectdependency](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[part]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[part](
	[id] [varchar](255) NOT NULL,
	[authority] [varchar](255) NULL,
	[description] [varchar](255) NULL,
	[drawing] [varchar](255) NULL,
	[lnk_drw_rclk] [varchar](255) NULL,
	[lnk_nbr_rclk] [varchar](255) NULL,
	[lnk_rev_rclk] [varchar](255) NULL,
	[lnk_str_rclk] [varchar](255) NULL,
	[number] [varchar](255) NULL,
	[parentid] [varchar](255) NULL,
	[qty] [int] NULL,
	[revision] [varchar](255) NULL,
	[status_drw_assgn] [varchar](255) NULL,
	[status_nbr_assgn] [varchar](255) NULL,
	[status_rev_assgn] [varchar](255) NULL,
	[status_str_assgn] [varchar](255) NULL,
	[string] [varchar](255) NULL,
	[cahier_id] [bigint] NULL,
	[parent_id] [varchar](255) NULL,
	[workcenter_id] [bigint] NULL,
	[type] [varchar](255) NULL,
	[flagabcl] [bit] NULL,
	[flagmethod] [bit] NULL,
	[partlist] [text] NULL,
	[material_no] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[string]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[string](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[cahier_id] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
***** Object:  Table [dbo].[workcenter]    Script Date: 2017-10-23 13:04:40 ****
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[workcenter](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[projectid] [varchar](255) NULL,
	[sectorid] [varchar](255) NULL,
	[subsectorid] [varchar](255) NULL,
	[title] [varchar](255); NULL,
	[wcnumber] [varchar](255); NULL,
	[csd] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[cahier] ON 

INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (90, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 1)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (91, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'215', 0, NULL, NULL, 215, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (92, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (93, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1234, N'GA1234-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (94, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 2345, N'GA2345-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (95, 0, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 0, NULL, 1, 0, 0, NULL, NULL, 1, N'190', 0, NULL, NULL, 190, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (96, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 3456, N'GA3456-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'191', 0, NULL, NULL, 191, 1)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (97, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'191', 0, NULL, NULL, 191, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (98, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'191', 0, NULL, NULL, 191, 0)
INSERT [dbo].[cahier] ([id], [bflag], [cahierduration], [description], [edl], [effectivity], [fromboard], [infotype_id], [jalonid], [job_role_id], [method_id], [name], [number], [odflag], [primary_job_type_qty], [product_id], [pva], [rflag], [sec_job_type], [sec_job_type_qty], [typeid], [wcid], [wirecut], [jalon_id], [objectdependency_id], [workcenter_id], [is_confirmed]) VALUES (99, 1, N'', N'', 0, N'', 0, NULL, NULL, 1, 1000, N'GA1000-B', NULL, 1, NULL, 1, 0, 1, NULL, NULL, 1, N'1087', 0, NULL, NULL, 1087, 1)
SET IDENTITY_INSERT [dbo].[cahier] OFF
SET IDENTITY_INSERT [dbo].[cahierdrawing] ON 

INSERT [dbo].[cahierdrawing] ([id], [effectivity], [flagabcl], [flagmethod], [number], [revision], [cahier_id]) VALUES (20, N'fwsefds', 1, 1, N'fdfe', N'fsedf', 91)
INSERT [dbo].[cahierdrawing] ([id], [effectivity], [flagabcl], [flagmethod], [number], [revision], [cahier_id]) VALUES (21, N'70006', 1, 1, N'11001', N'1', 90)
SET IDENTITY_INSERT [dbo].[cahierdrawing] OFF
SET IDENTITY_INSERT [dbo].[cahiertool] ON 







INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1805.0000040580', NULL, N'ECS - MASTER RAL - PROJECT SPECIFIC', NULL, N'http://bdiauthority1/1805.0000040580', N'http://bdiauthority2/1805.0000040580', N'http://bdiauthority3/1805.0000040580', N'http://bdiauthority4/1805.0000040580', N'RAL-BM700-S1043', NULL, 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, NULL, 1165, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1805.0000040585', NULL, N'ECS - MASTER RAL - PROJECT SPECIFIC', NULL, N'http://bdiauthority1/1805.0000040585', N'http://bdiauthority2/1805.0000040585', N'http://bdiauthority3/1805.0000040585', N'http://bdiauthority4/1805.0000040585', N'RAL-BM700-S1043', N'0000040580', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1805.0000040580', 1165, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1805.0000046251', NULL, N'ECS - PRODUCT LEVEL - CABINETS AND BULKHEADS', NULL, N'http://bdiauthority1/1805.0000046251', N'http://bdiauthority2/1805.0000046251', N'http://bdiauthority3/1805.0000046251', N'http://bdiauthority4/1805.0000046251', N'RAL-BP700-S1043', N'0000040585', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, N'2910011-E001-SD', NULL, N'1805.0000040585', 1165, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047073', NULL, N'ECS-PRODUCT LEVEL-CABINETS AND BULKHEADS', NULL, N'http://bdiauthority1/1809.0000047073', N'http://bdiauthority2/1809.0000047073', N'http://bdiauthority3/1809.0000047073', N'http://bdiauthority4/1809.0000047073', N'RAL-BP700-S1045', N'0000047068', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, N'2910011-E001-SD', NULL, NULL, 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047079', NULL, N'TABLE ASSY, DADO MOUNTED', NULL, N'http://bdiauthority1/1809.0000047079', N'http://bdiauthority2/1809.0000047079', N'http://bdiauthority3/1809.0000047079', N'http://bdiauthority4/1809.0000047079', N'G25028846', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047080', NULL, N'TABLE ASSY, DADO MOUNTED', NULL, N'http://bdiauthority1/1809.0000047080', N'http://bdiauthority2/1809.0000047080', N'http://bdiauthority3/1809.0000047080', N'http://bdiauthority4/1809.0000047080', N'G25028846', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047081', NULL, N'TABLE ASSY, CONFERENCE TABLE, ANGLED LH', NULL, N'http://bdiauthority1/1809.0000047081', N'http://bdiauthority2/1809.0000047081', N'http://bdiauthority3/1809.0000047081', N'http://bdiauthority4/1809.0000047081', N'G25028849', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047082', NULL, N'MOLDING INSTL, SQR MTL MOLDING', NULL, N'http://bdiauthority1/1809.0000047082', N'http://bdiauthority2/1809.0000047082', N'http://bdiauthority3/1809.0000047082', N'http://bdiauthority4/1809.0000047082', N'G25028850', N'0000047081', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047081', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047084', NULL, N'TABLE ASSY, CONFERENCE TABLE, ANGLED RH', NULL, N'http://bdiauthority1/1809.0000047084', N'http://bdiauthority2/1809.0000047084', N'http://bdiauthority3/1809.0000047084', N'http://bdiauthority4/1809.0000047084', N'G25028851', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047085', NULL, N'MOLDING INSTL, SQR MTL MOLDING', NULL, N'http://bdiauthority1/1809.0000047085', N'http://bdiauthority2/1809.0000047085', N'http://bdiauthority3/1809.0000047085', N'http://bdiauthority4/1809.0000047085', N'G25028852', N'0000047084', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047084', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047087', NULL, N'EXTENSION ASSY, CONFERENCE TABLE, ANGLED', NULL, N'http://bdiauthority1/1809.0000047087', N'http://bdiauthority2/1809.0000047087', N'http://bdiauthority3/1809.0000047087', N'http://bdiauthority4/1809.0000047087', N'G25028853', N'0000047073', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047073', 191, NULL, NULL, NULL, NULL, NULL);
INSERT bomb_macs5.part (id, authority, description, drawing, lnk_drw_rclk, lnk_nbr_rclk, lnk_rev_rclk, lnk_str_rclk, number, parentid, qty, revision, status_drw_assgn, status_nbr_assgn, status_rev_assgn, status_str_assgn, string, cahier_id, parent_id, workcenter_id, type, flagabcl, flagmethod, partlist, material_no) VALUES (N'1809.0000047088', NULL, N'MOLDING INSTL, SQR MTL MOLDING, NO INLAY', NULL, N'http://bdiauthority1/1809.0000047088', N'http://bdiauthority2/1809.0000047088', N'http://bdiauthority3/1809.0000047088', N'http://bdiauthority4/1809.0000047088', N'G25028854', N'0000047087', 1, NULL, NULL, N'TOBEASSIGNED', NULL, NULL, NULL, NULL, N'1809.0000047087', 191, NULL, NULL, NULL, NULL, NULL);













INSERT [dbo].[cahiertool] ([id], [description], [flagabcl], [flagmethod], [number], [cahier_id]) VALUES (20, N'test', 0, 0, N'11100', 90)
INSERT [dbo].[cahiertool] ([id], [description], [flagabcl], [flagmethod], [number], [cahier_id]) VALUES (21, N'TEST', 0, 0, N'11101', 90)
SET IDENTITY_INSERT [dbo].[cahiertool] OFF
SET IDENTITY_INSERT [dbo].[jalon] ON 

INSERT bomb_macs5.jalon (id, title, workcenter_id) VALUES (1, N'Jalon1', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id) VALUES (2, N'Jalon2', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (3, N'Jalon3', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (4, N'Jalon4', 7);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (61, N'Jalon1', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (62, N'Jalon2', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (63, N'Jalon3', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (64, N'Jalon4', 43);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (65, N'Jalon1', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (66, N'Jalon2', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (67, N'Jalon3', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (68, N'Jalon4', 44);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (69, N'Jalon1', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (70, N'Jalon2', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (71, N'Jalon3', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (72, N'Jalon4', 45);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (73, N'Jalon1', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (74, N'Jalon2', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (75, N'Jalon3', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (76, N'Jalon4', 46);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (77, N'Jalon1', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (78, N'Jalon2', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (79, N'Jalon3', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (80, N'Jalon4', 47);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (81, N'Jalon1', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (82, N'Jalon2', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (83, N'Jalon3', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (84, N'Jalon4', 48);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (85, N'Jalon1', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (86, N'Jalon2', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (87, N'Jalon3', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (88, N'Jalon4', 49);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (89, N'Jalon1', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (90, N'Jalon2', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (91, N'Jalon3', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (92, N'Jalon4', 50);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (93, N'Jalon1', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (94, N'Jalon2', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (95, N'Jalon3', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (96, N'Jalon4', 51);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (97, N'Jalon1', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (98, N'Jalon2', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (99, N'Jalon3', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (100, N'Jalon4', 52);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (101, N'Jalon1', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (102, N'Jalon2', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (103, N'Jalon3', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (104, N'Jalon4', 53);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (105, N'Jalon1', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (106, N'Jalon2', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (107, N'Jalon3', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (108, N'Jalon4', 54);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (109, N'Jalon1', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (110, N'Jalon2', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (111, N'Jalon3', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (112, N'Jalon4', 55);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (113, N'Jalon1', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (114, N'Jalon2', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (115, N'Jalon3', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (116, N'Jalon4', 56);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (117, N'Jalon1', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (118, N'Jalon2', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (119, N'Jalon3', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (120, N'Jalon4', 57);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (121, N'Jalon1', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (122, N'Jalon2', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (123, N'Jalon3', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (124, N'Jalon4', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (125, N'Jalon1', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (126, N'Jalon2', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (127, N'Jalon3', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (128, N'Jalon4', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (129, N'Jalon1', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (130, N'Jalon2', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (131, N'Jalon3', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (132, N'Jalon4', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (133, N'Jalon1', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (134, N'Jalon2', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (135, N'Jalon3', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (136, N'Jalon4', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (137, N'Jalon1', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (138, N'Jalon2', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (139, N'Jalon3', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (140, N'Jalon4', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (141, N'Jalon1', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (142, N'Jalon2', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (143, N'Jalon3', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (144, N'Jalon4', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (145, N'Jalon1', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (146, N'Jalon2', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (147, N'Jalon3', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (148, N'Jalon4', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (149, N'Jalon1', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (150, N'Jalon2', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (151, N'Jalon3', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (152, N'Jalon4', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (153, N'Jalon1', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (154, N'Jalon2', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (155, N'Jalon3', 66);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (156, N'Jalon4', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (157, N'Jalon1', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (158, N'Jalon2', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (159, N'Jalon3', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (160, N'Jalon4', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (161, N'Jalon1', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (162, N'Jalon2', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (163, N'Jalon3', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (164, N'Jalon4', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (165, N'Jalon1', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (166, N'Jalon2', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (167, N'Jalon3', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (168, N'Jalon4', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (169, N'Jalon1', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (170, N'Jalon2', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (171, N'Jalon3', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (172, N'Jalon4', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (173, N'Jalon1', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (174, N'Jalon2', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (175, N'Jalon3', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (176, N'Jalon4', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (177, N'Jalon1', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (178, N'Jalon2', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (179, N'Jalon3', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (180, N'Jalon4', 58);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (181, N'Jalon1', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (182, N'Jalon2', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (183, N'Jalon3', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (184, N'Jalon4', 59);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (185, N'Jalon1', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (186, N'Jalon2', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (187, N'Jalon3', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (188, N'Jalon4', 60);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (189, N'Jalon1', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (190, N'Jalon2', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (191, N'Jalon3', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (192, N'Jalon4', 61);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (193, N'Jalon1', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (194, N'Jalon2', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (195, N'Jalon3', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (196, N'Jalon4', 62);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (197, N'Jalon1', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (198, N'Jalon2', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (199, N'Jalon3', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (200, N'Jalon4', 63);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (201, N'Jalon1', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (202, N'Jalon2', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (203, N'Jalon3', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (204, N'Jalon4', 64);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (205, N'Jalon1', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (206, N'Jalon2', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (207, N'Jalon3', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (208, N'Jalon4', 65);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (209, N'Jalon1', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (210, N'Jalon2', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (211, N'Jalon3', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (212, N'Jalon4', 66);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (213, N'Jalon1', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (214, N'Jalon2', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (215, N'Jalon3', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (216, N'Jalon4', 67);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (217, N'Jalon1', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (218, N'Jalon2', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (219, N'Jalon3', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (220, N'Jalon4', 68);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (221, N'Jalon1', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (222, N'Jalon2', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (223, N'Jalon3', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (224, N'Jalon4', 69);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (225, N'Jalon1', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (226, N'Jalon2', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (227, N'Jalon3', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (228, N'Jalon4', 70);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (229, N'Jalon1', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (230, N'Jalon2', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (231, N'Jalon3', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (232, N'Jalon4', 71);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (342, N'#', 190);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (343, N'#', 191);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (344, N'#', 192);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (345, N'AS_3241_065_Prep_Finition2', 193);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (346, N'#', 194);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (347, N'#', 195);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (348, N'#', 196);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (349, N'#', 197);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (350, N'AS_3351_065_Prep_Finition2', 198);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (351, N'#', 199);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (352, N'AS_3141_056_Placage3', 200);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (353, N'#', 201);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (354, N'#', 202);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (355, N'#', 203);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (356, N'#', 204);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (357, N'#', 205);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (358, N'#', 206);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (359, N'#', 207);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (360, N'#', 208);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (361, N'#', 209);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (362, N'#', 210);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (363, N'#', 211);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (364, N'AS_3218_065_Prep_Finition', 212);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (365, N'#', 213);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (366, N'#', 214);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (367, N'AS_3175_065_Prep_Finition2', 215);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (368, N'AS_3191_065_Prep_Finition2', 216);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (370, N'#', 219);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (371, N'#', 220);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (372, N'#', 221);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (373, N'AS_3241_065_Prep_Finition2', 222);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (374, N'#', 223);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (375, N'#', 224);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (376, N'#', 225);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (377, N'#', 226);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (378, N'AS_3351_065_Prep_Finition2', 227);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (379, N'#', 228);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (380, N'AS_3141_065_Prep_Finition2', 229);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (381, N'#', 230);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (382, N'#', 231);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (383, N'#', 232);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (384, N'#', 233);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (385, N'#', 234);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (386, N'#', 235);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (387, N'#', 236);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (388, N'#', 237);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (389, N'#', 238);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (390, N'#', 239);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (391, N'#', 240);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (392, N'AS_3218_065_Prep_Finition', 241);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (393, N'#', 242);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (394, N'#', 243);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (395, N'AS_3175_065_Prep_Finition2', 244);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (396, N'AS_3191_065_Prep_Finition2', 245);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (397, N'#', 246);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (398, N'#', 247);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (399, N'#', 248);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (400, N'#', 249);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (401, N'AS_3241_065_Prep_Finition2', 250);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (402, N'#', 251);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (403, N'#', 252);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (404, N'#', 253);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (405, N'#', 254);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (406, N'AS_3351_065_Prep_Finition2', 255);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (407, N'#', 256);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (408, N'AS_3141_065_Prep_Finition2', 257);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (409, N'#', 258);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (410, N'#', 259);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (411, N'#', 260);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (412, N'#', 261);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (413, N'#', 262);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (414, N'#', 263);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (415, N'#', 264);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (416, N'#', 265);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (417, N'#', 266);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (418, N'#', 267);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (419, N'#', 268);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (420, N'AS_3218_065_Prep_Finition', 269);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (421, N'#', 270);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (422, N'#', 271);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (423, N'AS_3175_065_Prep_Finition2', 272);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (424, N'AS_3191_065_Prep_Finition2', 273);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (425, N'#', 274);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (426, N'#', 275);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (427, N'#', 276);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (428, N'#', 277);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (429, N'AS_3241_065_Prep_Finition2', 278);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (430, N'#', 279);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (431, N'#', 280);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (432, N'#', 281);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (433, N'#', 282);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (434, N'AS_3351_065_Prep_Finition2', 283);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (435, N'#', 284);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (436, N'AS_3141_065_Prep_Finition2', 285);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (437, N'#', 286);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (438, N'#', 287);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (439, N'#', 288);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (440, N'#', 289);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (441, N'#', 290);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (442, N'#', 291);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (443, N'#', 292);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (444, N'#', 293);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (445, N'#', 294);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (446, N'#', 295);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (447, N'#', 296);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (448, N'AS_3218_065_Prep_Finition', 297);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (449, N'#', 298);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (450, N'#', 299);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (451, N'AS_3175_065_Prep_Finition2', 300);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (452, N'AS_3191_065_Prep_Finition2', 301);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (453, N'#', 302);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (454, N'#', 303);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (455, N'#', 304);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (456, N'#', 305);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (457, N'AS_3241_065_Prep_Finition2', 306);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (458, N'#', 307);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (459, N'#', 308);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (460, N'#', 309);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (461, N'#', 310);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (462, N'AS_3351_065_Prep_Finition2', 311);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (463, N'#', 312);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (464, N'AS_3141_065_Prep_Finition2', 313);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (465, N'#', 314);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (466, N'#', 315);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (467, N'#', 316);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (468, N'#', 317);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (469, N'#', 318);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (470, N'#', 319);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (471, N'#', 320);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (472, N'#', 321);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (473, N'#', 322);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (474, N'#', 323);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (475, N'#', 324);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (476, N'AS_3218_065_Prep_Finition', 325);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (477, N'#', 326);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (478, N'#', 327);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (479, N'AS_3175_065_Prep_Finition2', 328);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (480, N'AS_3191_065_Prep_Finition2', 329);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (481, N'#', 330);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (482, N'#', 331);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (483, N'#', 332);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (484, N'#', 333);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (485, N'AS_3241_065_Prep_Finition2', 334);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (486, N'#', 335);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (487, N'#', 336);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (488, N'#', 337);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (489, N'#', 338);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (490, N'AS_3351_065_Prep_Finition2', 339);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (491, N'#', 340);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (492, N'AS_3141_065_Prep_Finition2', 341);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (493, N'#', 342);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (494, N'#', 343);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (495, N'#', 344);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (496, N'#', 345);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (497, N'#', 346);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (498, N'#', 347);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (499, N'#', 348);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (500, N'#', 349);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (501, N'#', 350);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (502, N'#', 351);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (503, N'#', 352);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (504, N'AS_3218_065_Prep_Finition', 353);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (505, N'#', 354);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (506, N'#', 355);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (507, N'AS_3175_065_Prep_Finition2', 356);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (508, N'AS_3191_065_Prep_Finition2', 357);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (509, N'#', 358);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (510, N'#', 359);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (511, N'#', 360);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (512, N'#', 361);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (513, N'AS_3241_065_Prep_Finition2', 362);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (514, N'#', 363);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (515, N'#', 364);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (516, N'#', 365);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (517, N'#', 366);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (518, N'AS_3351_065_Prep_Finition2', 367);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (519, N'#', 368);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (520, N'AS_3141_065_Prep_Finition2', 369);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (521, N'#', 370);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (522, N'#', 371);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (523, N'#', 372);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (524, N'#', 373);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (525, N'#', 374);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (526, N'#', 375);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (527, N'#', 376);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (528, N'#', 377);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (529, N'#', 378);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (530, N'#', 379);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (531, N'#', 380);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (532, N'AS_3218_065_Prep_Finition', 381);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (533, N'#', 382);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (534, N'#', 383);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (535, N'AS_3175_065_Prep_Finition2', 384);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (536, N'AS_3191_065_Prep_Finition2', 385);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (537, N'#', 386);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (538, N'#', 387);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (539, N'#', 388);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (540, N'#', 389);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (541, N'AS_3241_065_Prep_Finition2', 390);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (542, N'#', 391);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (543, N'#', 392);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (544, N'#', 393);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (545, N'#', 394);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (546, N'AS_3351_065_Prep_Finition2', 395);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (547, N'#', 396);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (548, N'AS_3141_065_Prep_Finition2', 397);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (549, N'#', 398);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (550, N'#', 399);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (551, N'#', 400);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (552, N'#', 401);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (553, N'#', 402);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (554, N'#', 403);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (555, N'#', 404);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (556, N'#', 405);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (557, N'#', 406);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (558, N'#', 407);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (559, N'#', 408);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (560, N'AS_3218_065_Prep_Finition', 409);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (561, N'#', 410);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (562, N'#', 411);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (563, N'AS_3175_065_Prep_Finition2', 412);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (564, N'AS_3191_065_Prep_Finition2', 413);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (565, N'#', 414);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (566, N'#', 415);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (567, N'#', 416);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (568, N'#', 417);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (569, N'AS_3241_065_Prep_Finition2', 418);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (570, N'#', 419);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (571, N'#', 420);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (572, N'#', 421);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (573, N'#', 422);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (574, N'AS_3351_065_Prep_Finition2', 423);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (575, N'#', 424);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (576, N'AS_3141_065_Prep_Finition2', 425);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (577, N'#', 426);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (578, N'#', 427);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (579, N'#', 428);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (580, N'#', 429);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (581, N'#', 430);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (582, N'#', 431);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (583, N'#', 432);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (584, N'#', 433);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (585, N'#', 434);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (586, N'#', 435);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (587, N'#', 436);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (588, N'AS_3218_065_Prep_Finition', 437);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (589, N'#', 438);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (590, N'#', 439);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (591, N'AS_3175_065_Prep_Finition2', 440);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (592, N'AS_3191_065_Prep_Finition2', 441);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (593, N'#', 442);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (594, N'#', 443);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (595, N'#', 444);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (596, N'#', 445);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (597, N'AS_3241_065_Prep_Finition2', 446);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (598, N'#', 447);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (599, N'#', 448);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (600, N'#', 449);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (601, N'#', 450);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (602, N'AS_3351_065_Prep_Finition2', 451);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (603, N'#', 452);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (604, N'AS_3141_065_Prep_Finition2', 453);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (605, N'#', 454);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (606, N'#', 455);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (607, N'#', 456);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (608, N'#', 457);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (609, N'#', 458);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (610, N'#', 459);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (611, N'#', 460);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (612, N'#', 461);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (613, N'#', 462);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (614, N'#', 463);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (615, N'#', 464);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (616, N'AS_3218_065_Prep_Finition', 465);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (617, N'#', 466);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (618, N'#', 467);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (619, N'AS_3175_065_Prep_Finition2', 468);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (620, N'AS_3191_065_Prep_Finition2', 469);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (621, N'#', 470);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (622, N'#', 471);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (623, N'#', 472);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (624, N'#', 473);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (625, N'AS_3241_065_Prep_Finition2', 474);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (626, N'#', 475);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (627, N'#', 476);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (628, N'#', 477);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (629, N'#', 478);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (630, N'AS_3351_065_Prep_Finition2', 479);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (631, N'#', 480);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (632, N'AS_3141_065_Prep_Finition2', 481);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (633, N'#', 482);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (634, N'#', 483);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (635, N'#', 484);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (636, N'#', 485);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (637, N'#', 486);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (638, N'#', 487);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (639, N'#', 488);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (640, N'#', 489);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (641, N'#', 490);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (642, N'#', 491);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (643, N'#', 492);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (644, N'AS_3218_065_Prep_Finition', 493);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (645, N'#', 494);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (646, N'#', 495);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (647, N'AS_3175_065_Prep_Finition2', 496);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (648, N'AS_3191_065_Prep_Finition2', 497);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (649, N'#', 498);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (650, N'#', 499);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (651, N'#', 500);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (652, N'#', 501);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (653, N'AS_3241_065_Prep_Finition2', 502);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (654, N'#', 503);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (655, N'#', 504);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (656, N'#', 505);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (657, N'#', 506);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (658, N'AS_3351_065_Prep_Finition2', 507);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (659, N'#', 508);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (660, N'AS_3141_065_Prep_Finition2', 509);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (661, N'#', 510);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (662, N'#', 511);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (663, N'#', 512);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (664, N'#', 513);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (665, N'#', 514);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (666, N'#', 515);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (667, N'#', 516);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (668, N'#', 517);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (669, N'#', 518);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (670, N'#', 519);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (671, N'#', 520);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (672, N'AS_3218_065_Prep_Finition', 521);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (673, N'#', 522);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (674, N'#', 523);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (675, N'AS_3175_065_Prep_Finition2', 524);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (676, N'AS_3191_065_Prep_Finition2', 525);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (677, N'#', 526);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (678, N'#', 527);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (679, N'#', 528);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (680, N'#', 529);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (681, N'AS_3241_065_Prep_Finition2', 530);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (682, N'#', 531);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (683, N'#', 532);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (684, N'#', 533);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (685, N'#', 534);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (686, N'AS_3351_065_Prep_Finition2', 535);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (687, N'#', 536);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (688, N'AS_3141_065_Prep_Finition2', 537);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (689, N'#', 538);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (690, N'#', 539);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (691, N'#', 540);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (692, N'#', 541);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (693, N'#', 542);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (694, N'#', 543);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (695, N'#', 544);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (696, N'#', 545);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (697, N'#', 546);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (698, N'#', 547);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (699, N'#', 548);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (700, N'AS_3218_065_Prep_Finition', 549);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (701, N'#', 550);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (702, N'#', 551);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (703, N'AS_3175_065_Prep_Finition2', 552);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (704, N'AS_3191_065_Prep_Finition2', 553);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (705, N'#', 554);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (706, N'#', 555);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (707, N'#', 556);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (708, N'#', 557);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (709, N'AS_3241_065_Prep_Finition2', 558);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (710, N'#', 559);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (711, N'#', 560);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (712, N'#', 561);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (713, N'#', 562);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (714, N'AS_3351_065_Prep_Finition2', 563);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (715, N'#', 564);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (716, N'AS_3141_065_Prep_Finition2', 565);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (717, N'#', 566);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (718, N'#', 567);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (719, N'#', 568);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (720, N'#', 569);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (721, N'#', 570);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (722, N'#', 571);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (723, N'#', 572);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (724, N'#', 573);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (725, N'#', 574);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (726, N'#', 575);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (727, N'#', 576);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (728, N'AS_3218_065_Prep_Finition', 577);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (729, N'#', 578);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (730, N'#', 579);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (731, N'AS_3175_065_Prep_Finition2', 580);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (732, N'AS_3191_065_Prep_Finition2', 581);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (733, N'#', 582);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (734, N'#', 583);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (735, N'#', 584);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (736, N'#', 585);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (737, N'AS_3241_065_Prep_Finition2', 586);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (738, N'#', 587);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (739, N'#', 588);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (740, N'#', 589);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (741, N'#', 590);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (742, N'AS_3351_065_Prep_Finition2', 591);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (743, N'#', 592);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (744, N'AS_3141_065_Prep_Finition2', 593);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (745, N'#', 594);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (746, N'#', 595);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (747, N'#', 596);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (748, N'#', 597);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (749, N'#', 598);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (750, N'#', 599);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (751, N'#', 600);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (752, N'#', 601);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (753, N'#', 602);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (754, N'#', 603);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (755, N'#', 604);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (756, N'AS_3218_065_Prep_Finition', 605);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (757, N'#', 606);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (758, N'#', 607);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (759, N'AS_3175_065_Prep_Finition2', 608);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (760, N'AS_3191_065_Prep_Finition2', 609);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (761, N'#', 610);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (762, N'#', 611);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (763, N'#', 612);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (764, N'#', 613);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (765, N'AS_3241_065_Prep_Finition2', 614);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (766, N'#', 615);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (767, N'#', 616);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (768, N'#', 617);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (769, N'#', 618);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (770, N'AS_3351_065_Prep_Finition2', 619);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (771, N'#', 620);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (772, N'AS_3141_065_Prep_Finition2', 621);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (773, N'#', 622);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (774, N'#', 623);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (775, N'#', 624);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (776, N'#', 625);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (777, N'#', 626);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (778, N'#', 627);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (779, N'#', 628);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (780, N'#', 629);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (781, N'#', 630);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (782, N'#', 631);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (783, N'#', 632);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (784, N'AS_3218_065_Prep_Finition', 633);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (785, N'#', 634);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (786, N'#', 635);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (787, N'AS_3175_065_Prep_Finition2', 636);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (788, N'AS_3191_065_Prep_Finition2', 637);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (789, N'#', 638);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (790, N'#', 639);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (791, N'#', 640);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (792, N'#', 641);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (793, N'AS_3241_065_Prep_Finition2', 642);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (794, N'#', 643);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (795, N'#', 644);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (796, N'#', 645);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (797, N'#', 646);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (798, N'AS_3351_065_Prep_Finition2', 647);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (799, N'#', 648);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (800, N'AS_3141_065_Prep_Finition2', 649);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (801, N'#', 650);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (802, N'#', 651);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (803, N'#', 652);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (804, N'#', 653);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (805, N'#', 654);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (806, N'#', 655);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (807, N'#', 656);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (808, N'#', 657);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (809, N'#', 658);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (810, N'#', 659);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (811, N'#', 660);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (812, N'AS_3218_065_Prep_Finition', 661);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (813, N'#', 662);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (814, N'#', 663);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (815, N'AS_3175_065_Prep_Finition2', 664);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (816, N'AS_3191_065_Prep_Finition2', 665);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (817, N'#', 666);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (818, N'#', 667);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (819, N'#', 668);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (820, N'#', 669);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (821, N'AS_3241_065_Prep_Finition2', 670);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (822, N'#', 671);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (823, N'#', 672);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (824, N'#', 673);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (825, N'#', 674);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (826, N'AS_3351_065_Prep_Finition2', 675);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (827, N'#', 676);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (828, N'AS_3141_065_Prep_Finition2', 677);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (829, N'#', 678);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (830, N'#', 679);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (831, N'#', 680);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (832, N'#', 681);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (833, N'#', 682);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (834, N'#', 683);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (835, N'#', 684);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (836, N'#', 685);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (837, N'#', 686);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (838, N'#', 687);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (839, N'#', 688);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (840, N'AS_3218_065_Prep_Finition', 689);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (841, N'#', 690);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (842, N'#', 691);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (843, N'AS_3175_065_Prep_Finition2', 692);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (844, N'AS_3191_065_Prep_Finition2', 693);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (845, N'#', 694);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (846, N'#', 695);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (847, N'#', 696);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (848, N'#', 697);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (849, N'AS_3241_065_Prep_Finition2', 698);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (850, N'#', 699);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (851, N'#', 700);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (852, N'#', 701);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (853, N'#', 702);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (854, N'AS_3351_065_Prep_Finition2', 703);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (855, N'#', 704);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (856, N'AS_3141_065_Prep_Finition2', 705);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (857, N'#', 706);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (858, N'#', 707);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (859, N'#', 708);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (860, N'#', 709);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (861, N'#', 710);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (862, N'#', 711);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (863, N'#', 712);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (864, N'#', 713);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (865, N'#', 714);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (866, N'#', 715);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (867, N'#', 716);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (868, N'AS_3218_065_Prep_Finition', 717);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (869, N'#', 718);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (870, N'#', 719);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (871, N'AS_3175_065_Prep_Finition2', 720);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (872, N'AS_3191_065_Prep_Finition2', 721);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (873, N'#', 722);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (874, N'#', 723);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (875, N'#', 724);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (876, N'#', 725);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (877, N'AS_3241_065_Prep_Finition2', 726);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (878, N'#', 727);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (879, N'#', 728);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (880, N'#', 729);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (881, N'#', 730);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (882, N'AS_3351_065_Prep_Finition2', 731);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (883, N'#', 732);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (884, N'AS_3141_065_Prep_Finition2', 733);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (885, N'#', 734);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (886, N'#', 735);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (887, N'#', 736);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (888, N'#', 737);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (889, N'#', 738);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (890, N'#', 739);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (891, N'#', 740);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (892, N'#', 741);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (893, N'#', 742);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (894, N'#', 743);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (895, N'#', 744);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (896, N'AS_3218_065_Prep_Finition', 745);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (897, N'#', 746);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (898, N'#', 747);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (899, N'AS_3175_065_Prep_Finition2', 748);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (900, N'AS_3191_065_Prep_Finition2', 749);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (901, N'#', 750);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (902, N'#', 751);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (903, N'#', 752);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (904, N'#', 753);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (905, N'AS_3241_065_Prep_Finition2', 754);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (906, N'#', 755);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (907, N'#', 756);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (908, N'#', 757);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (909, N'#', 758);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (910, N'AS_3351_065_Prep_Finition2', 759);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (911, N'#', 760);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (912, N'AS_3141_065_Prep_Finition2', 761);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (913, N'#', 762);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (914, N'#', 763);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (915, N'#', 764);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (916, N'#', 765);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (917, N'#', 766);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (918, N'#', 767);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (919, N'#', 768);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (920, N'#', 769);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (921, N'#', 770);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (922, N'#', 771);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (923, N'#', 772);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (924, N'AS_3218_065_Prep_Finition', 773);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (925, N'#', 774);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (926, N'#', 775);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (927, N'AS_3175_065_Prep_Finition2', 776);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (928, N'AS_3191_065_Prep_Finition2', 777);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (929, N'#', 778);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (930, N'#', 779);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (931, N'#', 780);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (932, N'#', 781);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (933, N'AS_3241_065_Prep_Finition2', 782);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (934, N'#', 783);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (935, N'#', 784);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (936, N'#', 785);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (937, N'#', 786);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (938, N'AS_3351_065_Prep_Finition2', 787);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (939, N'#', 788);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (940, N'AS_3141_065_Prep_Finition2', 789);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (941, N'#', 790);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (942, N'#', 791);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (943, N'#', 792);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (944, N'#', 793);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (945, N'#', 794);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (946, N'#', 795);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (947, N'#', 796);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (948, N'#', 797);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (949, N'#', 798);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (950, N'#', 799);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (951, N'#', 800);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (952, N'AS_3218_065_Prep_Finition', 801);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (953, N'#', 802);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (954, N'#', 803);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (955, N'AS_3175_065_Prep_Finition2', 804);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (956, N'AS_3191_065_Prep_Finition2', 805);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (957, N'#', 806);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (958, N'#', 807);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (959, N'#', 808);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (960, N'#', 809);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (961, N'AS_3241_065_Prep_Finition2', 810);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (962, N'#', 811);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (963, N'#', 812);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (964, N'#', 813);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (965, N'#', 814);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (966, N'AS_3351_065_Prep_Finition2', 815);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (967, N'#', 816);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (968, N'AS_3141_065_Prep_Finition2', 817);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (969, N'#', 818);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (970, N'#', 819);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (971, N'#', 820);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (972, N'#', 821);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (973, N'#', 822);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (974, N'#', 823);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (975, N'#', 824);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (976, N'#', 825);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (977, N'#', 826);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (978, N'#', 827);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (979, N'#', 828);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (980, N'AS_3218_065_Prep_Finition', 829);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (981, N'#', 830);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (982, N'#', 831);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (983, N'AS_3175_065_Prep_Finition2', 832);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (984, N'AS_3191_065_Prep_Finition2', 833);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (985, N'#', 834);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (986, N'#', 835);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (987, N'#', 836);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (988, N'#', 837);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (989, N'AS_3241_065_Prep_Finition2', 838);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (990, N'#', 839);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (991, N'#', 840);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (992, N'#', 841);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (993, N'#', 842);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (994, N'AS_3351_065_Prep_Finition2', 843);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (995, N'#', 844);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (996, N'AS_3141_065_Prep_Finition2', 845);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (997, N'#', 846);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (998, N'#', 847);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (999, N'#', 848);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1000, N'#', 849);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1001, N'#', 850);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1002, N'#', 851);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1003, N'#', 852);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1004, N'#', 853);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1005, N'#', 854);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1006, N'#', 855);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1007, N'#', 856);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1008, N'AS_3218_065_Prep_Finition', 857);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1009, N'#', 858);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1010, N'#', 859);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1011, N'AS_3175_065_Prep_Finition2', 860);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1012, N'AS_3191_065_Prep_Finition2', 861);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1013, N'#', 862);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1014, N'#', 863);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1015, N'#', 864);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1016, N'#', 865);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1017, N'AS_3241_065_Prep_Finition2', 866);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1018, N'#', 867);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1019, N'#', 868);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1020, N'#', 869);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1021, N'#', 870);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1022, N'AS_3351_065_Prep_Finition2', 871);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1023, N'#', 872);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1024, N'AS_3141_065_Prep_Finition2', 873);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1025, N'#', 874);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1026, N'#', 875);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1027, N'#', 876);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1028, N'#', 877);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1029, N'#', 878);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1030, N'#', 879);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1031, N'#', 880);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1032, N'#', 881);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1033, N'#', 882);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1034, N'#', 883);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1035, N'#', 884);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1036, N'AS_3218_065_Prep_Finition', 885);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1037, N'#', 886);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1038, N'#', 887);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1039, N'AS_3175_065_Prep_Finition2', 888);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1040, N'AS_3191_065_Prep_Finition2', 889);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1041, N'#', 890);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1070, N'#', 919);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1071, N'#', 920);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1072, N'#', 921);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1073, N'AS_3241_065_Prep_Finition2', 922);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1074, N'#', 923);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1075, N'#', 924);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1076, N'#', 925);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1077, N'#', 926);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1078, N'AS_3351_065_Prep_Finition2', 927);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1079, N'#', 928);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1080, N'AS_3141_065_Prep_Finition2', 929);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1081, N'#', 930);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1082, N'#', 931);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1083, N'#', 932);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1084, N'#', 933);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1085, N'#', 934);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1086, N'#', 935);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1087, N'#', 936);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1088, N'#', 937);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1089, N'#', 938);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1090, N'#', 939);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1091, N'#', 940);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1092, N'AS_3218_065_Prep_Finition', 941);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1093, N'#', 942);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1094, N'#', 943);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1095, N'AS_3175_065_Prep_Finition2', 944);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1096, N'AS_3191_065_Prep_Finition2', 945);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1097, N'#', 946);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1098, N'#', 947);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1099, N'#', 948);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1100, N'#', 949);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1101, N'AS_3241_065_Prep_Finition2', 950);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1102, N'#', 951);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1103, N'#', 952);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1104, N'#', 953);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1105, N'#', 954);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1106, N'AS_3351_065_Prep_Finition2', 955);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1107, N'#', 956);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1108, N'AS_3141_065_Prep_Finition2', 957);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1109, N'#', 958);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1110, N'#', 959);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1111, N'#', 960);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1112, N'#', 961);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1113, N'#', 962);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1114, N'#', 963);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1115, N'#', 964);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1116, N'#', 965);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1117, N'#', 966);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1118, N'#', 967);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1119, N'#', 968);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1120, N'AS_3218_065_Prep_Finition', 969);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1121, N'#', 970);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1122, N'#', 971);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1123, N'AS_3175_065_Prep_Finition2', 972);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1124, N'AS_3191_065_Prep_Finition2', 973);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1125, N'#', 974);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1126, N'#', 975);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1127, N'#', 976);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1128, N'#', 977);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1129, N'AS_3241_065_Prep_Finition2', 978);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1130, N'#', 979);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1131, N'#', 980);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1132, N'#', 981);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1133, N'#', 982);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1134, N'AS_3351_065_Prep_Finition2', 983);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1135, N'#', 984);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1136, N'AS_3141_065_Prep_Finition2', 985);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1137, N'#', 986);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1138, N'#', 987);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1139, N'#', 988);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1140, N'#', 989);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1141, N'#', 990);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1142, N'#', 991);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1143, N'#', 992);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1144, N'#', 993);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1145, N'#', 994);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1146, N'#', 995);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1147, N'#', 996);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1148, N'AS_3218_065_Prep_Finition', 997);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1149, N'#', 998);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1150, N'#', 999);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1151, N'AS_3175_065_Prep_Finition2', 1000);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1152, N'AS_3191_065_Prep_Finition2', 1001);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1153, N'#', 1002);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1154, N'#', 1003);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1155, N'#', 1004);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1156, N'#', 1005);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1157, N'AS_3241_065_Prep_Finition2', 1006);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1158, N'#', 1007);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1159, N'#', 1008);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1160, N'#', 1009);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1161, N'#', 1010);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1162, N'AS_3351_065_Prep_Finition2', 1011);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1163, N'#', 1012);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1164, N'AS_3141_065_Prep_Finition2', 1013);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1165, N'#', 1014);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1166, N'#', 1015);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1167, N'#', 1016);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1168, N'#', 1017);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1169, N'#', 1018);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1170, N'#', 1019);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1171, N'#', 1020);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1172, N'#', 1021);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1173, N'#', 1022);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1174, N'#', 1023);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1175, N'#', 1024);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1176, N'AS_3218_065_Prep_Finition', 1025);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1177, N'#', 1026);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1178, N'#', 1027);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1179, N'AS_3175_065_Prep_Finition2', 1028);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1180, N'AS_3191_065_Prep_Finition2', 1029);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1181, N'#', 1030);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1182, N'#', 1031);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1183, N'#', 1032);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1184, N'#', 1033);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1185, N'AS_3241_065_Prep_Finition2', 1034);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1186, N'#', 1035);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1187, N'#', 1036);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1188, N'#', 1037);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1189, N'#', 1038);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1190, N'AS_3351_065_Prep_Finition2', 1039);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1191, N'#', 1040);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1192, N'AS_3141_065_Prep_Finition2', 1041);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1193, N'#', 1042);
GO
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1194, N'#', 1043);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1195, N'#', 1044);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1196, N'#', 1045);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1197, N'#', 1046);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1198, N'#', 1047);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1199, N'#', 1048);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1200, N'#', 1049);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1201, N'#', 1050);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1202, N'#', 1051);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1203, N'#', 1052);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1204, N'AS_3218_065_Prep_Finition', 1053);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1205, N'#', 1054);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1206, N'#', 1055);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1207, N'AS_3175_065_Prep_Finition2', 1056);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1208, N'AS_3191_065_Prep_Finition2', 1057);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1209, N'#', 1058);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1210, N'#', 1059);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1211, N'#', 1060);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1212, N'#', 1061);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1213, N'AS_3241_065_Prep_Finition2', 1062);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1214, N'#', 1063);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1215, N'#', 1064);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1216, N'#', 1065);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1217, N'#', 1066);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1218, N'AS_3351_065_Prep_Finition2', 1067);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1219, N'#', 1068);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1220, N'AS_3141_065_Prep_Finition2', 1069);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1221, N'#', 1070);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1222, N'#', 1071);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1223, N'#', 1072);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1224, N'#', 1073);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1225, N'#', 1074);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1226, N'#', 1075);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1227, N'#', 1076);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1228, N'#', 1077);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1229, N'#', 1078);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1230, N'#', 1079);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1231, N'#', 1080);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1232, N'AS_3218_065_Prep_Finition', 1081);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1233, N'#', 1082);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1234, N'#', 1083);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1235, N'AS_3175_065_Prep_Finition2', 1084);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1236, N'AS_3191_065_Prep_Finition2', 1085);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1237, N'#', 1086);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1238, N'#', 1087);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1239, N'#', 1088);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1240, N'#', 1089);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1241, N'AS_3241_065_Prep_Finition2', 1090);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1242, N'#', 1091);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1243, N'#', 1092);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1244, N'#', 1093);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1245, N'#', 1094);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1246, N'AS_3351_065_Prep_Finition2', 1095);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1247, N'#', 1096);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1248, N'AS_3141_065_Prep_Finition2', 1097);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1249, N'#', 1098);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1250, N'#', 1099);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1251, N'#', 1100);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1252, N'#', 1101);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1253, N'#', 1102);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1254, N'#', 1103);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1255, N'#', 1104);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1256, N'#', 1105);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1257, N'#', 1106);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1258, N'#', 1107);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1259, N'#', 1108);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1260, N'AS_3218_065_Prep_Finition', 1109);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1261, N'#', 1110);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1262, N'#', 1111);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1263, N'AS_3175_065_Prep_Finition2', 1112);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1264, N'AS_3191_065_Prep_Finition2', 1113);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1265, N'#', 1114);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1266, N'#', 1115);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1267, N'#', 1116);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1268, N'#', 1117);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1269, N'AS_3241_065_Prep_Finition2', 1118);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1270, N'#', 1119);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1271, N'#', 1120);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1272, N'#', 1121);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1273, N'#', 1122);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1274, N'AS_3351_065_Prep_Finition2', 1123);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1275, N'#', 1124);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1276, N'AS_3141_065_Prep_Finition2', 1125);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1277, N'#', 1126);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1278, N'#', 1127);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1279, N'#', 1128);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1280, N'#', 1129);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1281, N'#', 1130);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1282, N'#', 1132);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1283, N'#', 1132);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1284, N'#', 1133);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1285, N'#', 1134);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1286, N'#', 1135);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1287, N'#', 1136);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1288, N'AS_3218_065_Prep_Finition', 1137);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1289, N'#', 1138)
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1290, N'#', 1139);;
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1291, N'AS_3175_065_Prep_Finition2', 1140);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1292, N'AS_3191_065_Prep_Finition2', 1141);
INSERT bomb_macs5.jalon (id, title, workcenter_id)  VALUES (1293, N'#', 1142);






SET IDENTITY_INSERT [dbo].[jalon] OFF
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'http://sapurl', N'https://bdi.ca.aero.bombardier.net/ebom/part/', N'http://bdiauthority', N'https://bdi.ca.aero.bombardier.net/ebom/part/', N'G25022555-001', NULL, NULL, 10, N'[001]', N'ASSIGNED', N'NOTASSIGNED', N'ASSIGNED', N'NOTASSIGNED', N'test1', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-002', N'1', NULL, 0, N'[005]', N'ASSIGNED', N'ASSIGNED', N'ASSIGNED', N'ASSIGNED', N'test2', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.10', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-018', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.10.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-019', N'1.10', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.10.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-020', N'1.10', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.10.3', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-021', N'1.10', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.10.4', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-022', N'1.10', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.10.5', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-023', N'1.10', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.11', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-024', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.12', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-025', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.13', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-026', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.14', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-027', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.15', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-028', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.16', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-029', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.17', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-030', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-003', N'1', NULL, 0, NULL, N'NOTASSIGNED', N'ASSIGNED', N'ASSIGNED', N'NOTASSIGNED', N'test3', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.3', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-004', N'1', NULL, 1, NULL, N'ASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'test4', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.4', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-005', N'1', NULL, 1, N'[002]', N'ASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'test5', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.5', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-006', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'test6', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-007', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'test7', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-008', N'1.6', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'test8', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-009', N'1.6', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'test9', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.3', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-010', N'1.6', NULL, 1, NULL, N'ASSIGNED', N'NOTASSIGNED', N'ASSIGNED', N'ASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.4', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-011', N'1.6', NULL, 1, NULL, N'ASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.4.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-012', N'1.6.4', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.4.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-013', N'1.6.4', NULL, 1, NULL, N'ASSIGNED', N'TOBEASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.6.5', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-014', N'1.6', NULL, 0, NULL, N'ASSIGNED', N'ASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.7', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-015', N'1', NULL, 0, NULL, N'ASSIGNED', N'ASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.8', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-016', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'1.9', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-017', N'1', NULL, 1, NULL, N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'NOTASSIGNED', N'', NULL, NULL, NULL, NULL, N'999', N'999', N'999')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'http://sapurl', N'https://bdi.ca.aero.bombardier.net/ebom/part/', N'http://bdiauthority', N'https://bdi.ca.aero.bombardier.net/ebom/part/', N'G25022555-001', NULL, NULL, 10, N'[001]', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test1', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-002', N'2', NULL, 0, N'[005]', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test2', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.10', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-018', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.10.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-019', N'2.10', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.10.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-020', N'2.10', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.10.3', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-021', N'2.10', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.10.4', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-022', N'2.10', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.10.5', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-023', N'2.10', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.11', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-024', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.12', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-025', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.13', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-026', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.14', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-027', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.15', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-028', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.16', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-029', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.17', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-030', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-003', N'2', NULL, 0, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test3', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.3', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-004', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test4', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.4', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-005', N'2', NULL, 1, N'[002]', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test5', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.5', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-006', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test6', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-007', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test7', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-008', N'2.6', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test8', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-009', N'2.6', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'test9', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.3', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-010', N'2.6', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.4', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-011', N'2.6', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.4.1', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-012', N'2.6.4', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.4.2', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-013', N'2.6.4', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.6.5', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-014', N'2.6', NULL, 0, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.7', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-015', N'2', NULL, 0, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.8', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-016', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
INSERT [dbo].[masterpart] ([id], [authority], [cahierid], [ci], [description], [drawing], [lnk_drw_rclk], [lnk_nbr_rclk], [lnk_rev_rclk], [lnk_str_rclk], [number], [parentid], [part_nbr], [qty], [revision], [status_drw_assgn], [status_nbr_assgn], [status_rev_assgn], [status_str_assgn], [string], [type], [cahier_id], [parent_id], [workcenter_id], [project], [sector], [sub_sector]) VALUES (N'2.9', N'RV-504-608 A', NULL, NULL, N'EXTENSION ASSY, CON', N'G25022555 [ A ]', N'', N'', N'', N'', N'G25022555-017', N'2', NULL, 1, NULL, N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'UNASSIGNED', N'', NULL, NULL, NULL, NULL, N'888', N'888', N'888')
SET IDENTITY_INSERT [dbo].[workcenter] ON 


INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1, N'1000', N'1000', N'1000', N'workcenter1000', N'1000', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (2, N'1000', N'1000', N'2000', N'workcenter2000', N'2000', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (3, N'1000', N'2000', N'2000', N'workcenter3000', N'3000', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (4, N'1000', N'1000', N'1000', N'workcenter1000', N'1000', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (5, N'1000', N'1000', N'2000', N'workcenter2000', N'2000', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (6, N'1000', N'2000', N'2000', N'workcenter3000', N'3000', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (7, N'999', N'999', N'999', N'Workcenter 1', N'999_1', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (43, N'888', N'888', N'888', N'Workcenter 1', N'888_1', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (44, N'888', N'888', N'888', N'Workcenter 2', N'888_2', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (45, N'888', N'888', N'888', N'Workcenter 3', N'888_3', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (46, N'888', N'888', N'888', N'Workcenter 4', N'888_4', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (47, N'888', N'888', N'888', N'Workcenter 5', N'888_5', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (48, N'888', N'888', N'888', N'Workcenter 6', N'888_6', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (49, N'888', N'888', N'888', N'Workcenter 7', N'888_7', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (50, N'888', N'888', N'888', N'Workcenter 8', N'888_8', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (51, N'888', N'888', N'888', N'Workcenter 9', N'888_9', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (52, N'888', N'888', N'888', N'Workcenter 10', N'888_10', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (53, N'888', N'888', N'888', N'Workcenter 11', N'888_11', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (54, N'888', N'888', N'888', N'Workcenter 12', N'888_12', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (55, N'888', N'888', N'888', N'Workcenter 13', N'888_13', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (56, N'888', N'888', N'888', N'Workcenter 14', N'888_14', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (57, N'888', N'888', N'888', N'Workcenter 15', N'888_15', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (58, N'999', N'999', N'999', N'Workcenter 2', N'999_2', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (59, N'999', N'999', N'999', N'Workcenter 3', N'999_3', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (60, N'999', N'999', N'999', N'Workcenter 4', N'999_4', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (61, N'999', N'999', N'999', N'Workcenter 5', N'999_5', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (62, N'999', N'999', N'999', N'Workcenter 6', N'999_6', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (63, N'999', N'999', N'999', N'Workcenter 7', N'999_7', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (64, N'999', N'999', N'999', N'Workcenter 8', N'999_8', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (65, N'999', N'999', N'999', N'Workcenter 9', N'999_9', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (66, N'999', N'999', N'999', N'Workcenter 10', N'999_10', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (67, N'999', N'999', N'999', N'Workcenter 11', N'999_11', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (68, N'999', N'999', N'999', N'Workcenter 12', N'999_12', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (69, N'999', N'999', N'999', N'Workcenter 13', N'999_13', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (70, N'999', N'999', N'999', N'Workcenter 14', N'999_14', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (71, N'999', N'999', N'999', N'Workcenter 15', N'999_15', NULL)
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (190, N'1809', N'BP', N'GE1122', N'1041/AMQ110', N'1041AMQ110', 0);;
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (191, N'1809', N'BP', N'GE1122', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (192, N'1809', N'BP', N'GE1122', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (193, N'1809', N'BP', N'GE1122', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (194, N'1809', N'BP', N'GE1122', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (195, N'1809', N'BP', N'GE1122', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (196, N'1809', N'BP', N'GE1122', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (197, N'1809', N'BP', N'GE1122', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (198, N'1809', N'BP', N'GE1122', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (199, N'1809', N'BP', N'GE1122', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (200, N'1809', N'BP', N'GE1122', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (201, N'1809', N'BP', N'GE1122', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (202, N'1809', N'BP', N'GE1122', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (203, N'1809', N'BP', N'GE1122', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (204, N'1809', N'BP', N'GE1122', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (205, N'1809', N'BP', N'GE1122', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (206, N'1809', N'BP', N'GE1122', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (207, N'1809', N'BP', N'GE1122', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (208, N'1809', N'BP', N'GE1122', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (209, N'1809', N'BP', N'GE1122', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (210, N'1809', N'BP', N'GE1122', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (211, N'1809', N'BP', N'GE1122', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (212, N'1809', N'BP', N'GE1122', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (213, N'1809', N'BP', N'GE1122', N'1041/AME110', N'1041AME10', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (214, N'1809', N'BP', N'GE1122', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (215, N'1809', N'BP', N'GE1122', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (216, N'1809', N'BP', N'GE1122', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (217, N'1809', N'BP', N'GE1122', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (219, N'1600', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (220, N'1600', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (221, N'1600', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (222, N'1600', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (223, N'1600', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (224, N'1600', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (225, N'1600', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (226, N'1600', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (227, N'1600', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (228, N'1600', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (229, N'1600', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (230, N'1600', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (231, N'1600', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (232, N'1600', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (233, N'1600', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (234, N'1600', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (235, N'1600', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (236, N'1600', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (237, N'1600', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (238, N'1600', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (239, N'1600', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (240, N'1600', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (241, N'1600', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (242, N'1600', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (243, N'1600', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (244, N'1600', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (245, N'1600', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (246, N'1600', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (247, N'1600', N'BP', N'GE1122', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (248, N'1600', N'BP', N'GE1122', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (249, N'1600', N'BP', N'GE1122', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (250, N'1600', N'BP', N'GE1122', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (251, N'1600', N'BP', N'GE1122', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (252, N'1600', N'BP', N'GE1122', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (253, N'1600', N'BP', N'GE1122', N'1041/KML110', N'1041KML110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (254, N'1600', N'BP', N'GE1122', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (255, N'1600', N'BP', N'GE1122', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (256, N'1600', N'BP', N'GE1122', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (257, N'1600', N'BP', N'GE1122', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (258, N'1600', N'BP', N'GE1122', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (259, N'1600', N'BP', N'GE1122', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (260, N'1600', N'BP', N'GE1122', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (261, N'1600', N'BP', N'GE1122', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (262, N'1600', N'BP', N'GE1122', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (263, N'1600', N'BP', N'GE1122', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (264, N'1600', N'BP', N'GE1122', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (265, N'1600', N'BP', N'GE1122', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (266, N'1600', N'BP', N'GE1122', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (267, N'1600', N'BP', N'GE1122', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (268, N'1600', N'BP', N'GE1122', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (269, N'1600', N'BP', N'GE1122', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (270, N'1600', N'BP', N'GE1122', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (271, N'1600', N'BP', N'GE1122', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (272, N'1600', N'BP', N'GE1122', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (273, N'1600', N'BP', N'GE1122', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (274, N'1600', N'BP', N'GE1122', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (275, N'1809', N'BP', N'GE1101', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (276, N'1809', N'BP', N'GE1101', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (277, N'1809', N'BP', N'GE1101', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (278, N'1809', N'BP', N'GE1101', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (279, N'1809', N'BP', N'GE1101', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (280, N'1809', N'BP', N'GE1101', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (281, N'1809', N'BP', N'GE1101', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (282, N'1809', N'BP', N'GE1101', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (283, N'1809', N'BP', N'GE1101', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (284, N'1809', N'BP', N'GE1101', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (285, N'1809', N'BP', N'GE1101', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (286, N'1809', N'BP', N'GE1101', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (287, N'1809', N'BP', N'GE1101', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (288, N'1809', N'BP', N'GE1101', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (289, N'1809', N'BP', N'GE1101', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (290, N'1809', N'BP', N'GE1101', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (291, N'1809', N'BP', N'GE1101', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (292, N'1809', N'BP', N'GE1101', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (293, N'1809', N'BP', N'GE1101', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (294, N'1809', N'BP', N'GE1101', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (295, N'1809', N'BP', N'GE1101', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (296, N'1809', N'BP', N'GE1101', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (297, N'1809', N'BP', N'GE1101', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (298, N'1809', N'BP', N'GE1101', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (299, N'1809', N'BP', N'GE1101', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (300, N'1809', N'BP', N'GE1101', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (301, N'1809', N'BP', N'GE1101', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (302, N'1809', N'BP', N'GE1101', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (303, N'1600', N'BV', N'GE1404', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (304, N'1600', N'BV', N'GE1404', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (305, N'1600', N'BV', N'GE1404', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (306, N'1600', N'BV', N'GE1404', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (307, N'1600', N'BV', N'GE1404', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (308, N'1600', N'BV', N'GE1404', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (309, N'1600', N'BV', N'GE1404', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (310, N'1600', N'BV', N'GE1404', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (311, N'1600', N'BV', N'GE1404', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (312, N'1600', N'BV', N'GE1404', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (313, N'1600', N'BV', N'GE1404', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (314, N'1600', N'BV', N'GE1404', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (315, N'1600', N'BV', N'GE1404', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (316, N'1600', N'BV', N'GE1404', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (317, N'1600', N'BV', N'GE1404', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (318, N'1600', N'BV', N'GE1404', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (319, N'1600', N'BV', N'GE1404', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (320, N'1600', N'BV', N'GE1404', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (321, N'1600', N'BV', N'GE1404', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (322, N'1600', N'BV', N'GE1404', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (323, N'1600', N'BV', N'GE1404', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (324, N'1600', N'BV', N'GE1404', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (325, N'1600', N'BV', N'GE1404', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (326, N'1600', N'BV', N'GE1404', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (327, N'1600', N'BV', N'GE1404', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (328, N'1600', N'BV', N'GE1404', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (329, N'1600', N'BV', N'GE1404', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (330, N'1600', N'BV', N'GE1404', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (331, N'1212', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (332, N'1212', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (333, N'1212', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (334, N'1212', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (335, N'1212', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (336, N'1212', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (337, N'1212', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (338, N'1212', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (339, N'1212', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (340, N'1212', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (341, N'1212', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (342, N'1212', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (343, N'1212', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (344, N'1212', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (345, N'1212', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (346, N'1212', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (347, N'1212', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (348, N'1212', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (349, N'1212', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (350, N'1212', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (351, N'1212', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (352, N'1212', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (353, N'1212', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (354, N'1212', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (355, N'1212', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (356, N'1212', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (357, N'1212', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (358, N'1212', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (359, N'1212', N'BI', N'GE3102', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (360, N'1212', N'BI', N'GE3102', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (361, N'1212', N'BI', N'GE3102', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (362, N'1212', N'BI', N'GE3102', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (363, N'1212', N'BI', N'GE3102', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (364, N'1212', N'BI', N'GE3102', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (365, N'1212', N'BI', N'GE3102', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (366, N'1212', N'BI', N'GE3102', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (367, N'1212', N'BI', N'GE3102', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (368, N'1212', N'BI', N'GE3102', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (369, N'1212', N'BI', N'GE3102', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (370, N'1212', N'BI', N'GE3102', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (371, N'1212', N'BI', N'GE3102', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (372, N'1212', N'BI', N'GE3102', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (373, N'1212', N'BI', N'GE3102', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (374, N'1212', N'BI', N'GE3102', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (375, N'1212', N'BI', N'GE3102', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (376, N'1212', N'BI', N'GE3102', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (377, N'1212', N'BI', N'GE3102', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (378, N'1212', N'BI', N'GE3102', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (379, N'1212', N'BI', N'GE3102', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (380, N'1212', N'BI', N'GE3102', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (381, N'1212', N'BI', N'GE3102', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (382, N'1212', N'BI', N'GE3102', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (383, N'1212', N'BI', N'GE3102', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (384, N'1212', N'BI', N'GE3102', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (385, N'1212', N'BI', N'GE3102', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (386, N'1212', N'BI', N'GE3102', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (387, N'1212', N'BV', N'GE1405', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (388, N'1212', N'BV', N'GE1405', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (389, N'1212', N'BV', N'GE1405', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (390, N'1212', N'BV', N'GE1405', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (391, N'1212', N'BV', N'GE1405', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (392, N'1212', N'BV', N'GE1405', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (393, N'1212', N'BV', N'GE1405', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (394, N'1212', N'BV', N'GE1405', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (395, N'1212', N'BV', N'GE1405', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (396, N'1212', N'BV', N'GE1405', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (397, N'1212', N'BV', N'GE1405', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (398, N'1212', N'BV', N'GE1405', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (399, N'1212', N'BV', N'GE1405', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (400, N'1212', N'BV', N'GE1405', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (401, N'1212', N'BV', N'GE1405', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (402, N'1212', N'BV', N'GE1405', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (403, N'1212', N'BV', N'GE1405', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (404, N'1212', N'BV', N'GE1405', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (405, N'1212', N'BV', N'GE1405', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (406, N'1212', N'BV', N'GE1405', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (407, N'1212', N'BV', N'GE1405', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (408, N'1212', N'BV', N'GE1405', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (409, N'1212', N'BV', N'GE1405', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (410, N'1212', N'BV', N'GE1405', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (411, N'1212', N'BV', N'GE1405', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (412, N'1212', N'BV', N'GE1405', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (413, N'1212', N'BV', N'GE1405', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (414, N'1212', N'BV', N'GE1405', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (415, N'1212', N'BN', N'XE7019', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (416, N'1212', N'BN', N'XE7019', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (417, N'1212', N'BN', N'XE7019', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (418, N'1212', N'BN', N'XE7019', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (419, N'1212', N'BN', N'XE7019', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (420, N'1212', N'BN', N'XE7019', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (421, N'1212', N'BN', N'XE7019', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (422, N'1212', N'BN', N'XE7019', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (423, N'1212', N'BN', N'XE7019', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (424, N'1212', N'BN', N'XE7019', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (425, N'1212', N'BN', N'XE7019', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (426, N'1212', N'BN', N'XE7019', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (427, N'1212', N'BN', N'XE7019', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (428, N'1212', N'BN', N'XE7019', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (429, N'1212', N'BN', N'XE7019', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (430, N'1212', N'BN', N'XE7019', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (431, N'1212', N'BN', N'XE7019', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (432, N'1212', N'BN', N'XE7019', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (433, N'1212', N'BN', N'XE7019', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (434, N'1212', N'BN', N'XE7019', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (435, N'1212', N'BN', N'XE7019', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (436, N'1212', N'BN', N'XE7019', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (437, N'1212', N'BN', N'XE7019', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (438, N'1212', N'BN', N'XE7019', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (439, N'1212', N'BN', N'XE7019', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (440, N'1212', N'BN', N'XE7019', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (441, N'1212', N'BN', N'XE7019', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (442, N'1212', N'BN', N'XE7019', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (443, N'1212', N'BV', N'GE1404', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (444, N'1212', N'BV', N'GE1404', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (445, N'1212', N'BV', N'GE1404', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (446, N'1212', N'BV', N'GE1404', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (447, N'1212', N'BV', N'GE1404', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (448, N'1212', N'BV', N'GE1404', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (449, N'1212', N'BV', N'GE1404', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (450, N'1212', N'BV', N'GE1404', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (451, N'1212', N'BV', N'GE1404', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (452, N'1212', N'BV', N'GE1404', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (453, N'1212', N'BV', N'GE1404', N'1041/AMB110', N'1041AMB110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (454, N'1212', N'BV', N'GE1404', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (455, N'1212', N'BV', N'GE1404', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (456, N'1212', N'BV', N'GE1404', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (457, N'1212', N'BV', N'GE1404', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (458, N'1212', N'BV', N'GE1404', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (459, N'1212', N'BV', N'GE1404', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (460, N'1212', N'BV', N'GE1404', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (461, N'1212', N'BV', N'GE1404', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (462, N'1212', N'BV', N'GE1404', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (463, N'1212', N'BV', N'GE1404', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (464, N'1212', N'BV', N'GE1404', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (465, N'1212', N'BV', N'GE1404', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (466, N'1212', N'BV', N'GE1404', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (467, N'1212', N'BV', N'GE1404', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (468, N'1212', N'BV', N'GE1404', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (469, N'1212', N'BV', N'GE1404', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (470, N'1212', N'BV', N'GE1404', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (471, N'1212', N'BI', N'GE3104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (472, N'1212', N'BI', N'GE3104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (473, N'1212', N'BI', N'GE3104', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (474, N'1212', N'BI', N'GE3104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (475, N'1212', N'BI', N'GE3104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (476, N'1212', N'BI', N'GE3104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (477, N'1212', N'BI', N'GE3104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (478, N'1212', N'BI', N'GE3104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (479, N'1212', N'BI', N'GE3104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (480, N'1212', N'BI', N'GE3104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (481, N'1212', N'BI', N'GE3104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (482, N'1212', N'BI', N'GE3104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (483, N'1212', N'BI', N'GE3104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (484, N'1212', N'BI', N'GE3104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (485, N'1212', N'BI', N'GE3104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (486, N'1212', N'BI', N'GE3104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (487, N'1212', N'BI', N'GE3104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (488, N'1212', N'BI', N'GE3104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (489, N'1212', N'BI', N'GE3104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (490, N'1212', N'BI', N'GE3104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (491, N'1212', N'BI', N'GE3104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (492, N'1212', N'BI', N'GE3104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (493, N'1212', N'BI', N'GE3104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (494, N'1212', N'BI', N'GE3104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (495, N'1212', N'BI', N'GE3104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (496, N'1212', N'BI', N'GE3104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (497, N'1212', N'BI', N'GE3104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (498, N'1212', N'BI', N'GE3104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (499, N'1212', N'BI', N'GE3103', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (500, N'1212', N'BI', N'GE3103', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (501, N'1212', N'BI', N'GE3103', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (502, N'1212', N'BI', N'GE3103', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (503, N'1212', N'BI', N'GE3103', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (504, N'1212', N'BI', N'GE3103', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (505, N'1212', N'BI', N'GE3103', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (506, N'1212', N'BI', N'GE3103', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (507, N'1212', N'BI', N'GE3103', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (508, N'1212', N'BI', N'GE3103', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (509, N'1212', N'BI', N'GE3103', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (510, N'1212', N'BI', N'GE3103', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (511, N'1212', N'BI', N'GE3103', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (512, N'1212', N'BI', N'GE3103', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (513, N'1212', N'BI', N'GE3103', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (514, N'1212', N'BI', N'GE3103', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (515, N'1212', N'BI', N'GE3103', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (516, N'1212', N'BI', N'GE3103', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (517, N'1212', N'BI', N'GE3103', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (518, N'1212', N'BI', N'GE3103', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (519, N'1212', N'BI', N'GE3103', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (520, N'1212', N'BI', N'GE3103', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (521, N'1212', N'BI', N'GE3103', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (522, N'1212', N'BI', N'GE3103', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (523, N'1212', N'BI', N'GE3103', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (524, N'1212', N'BI', N'GE3103', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (525, N'1212', N'BI', N'GE3103', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (526, N'1212', N'BI', N'GE3103', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (527, N'1212', N'BN', N'GE9601', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (528, N'1212', N'BN', N'GE9601', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (529, N'1212', N'BN', N'GE9601', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (530, N'1212', N'BN', N'GE9601', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (531, N'1212', N'BN', N'GE9601', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (532, N'1212', N'BN', N'GE9601', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (533, N'1212', N'BN', N'GE9601', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (534, N'1212', N'BN', N'GE9601', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (535, N'1212', N'BN', N'GE9601', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (536, N'1212', N'BN', N'GE9601', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (537, N'1212', N'BN', N'GE9601', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (538, N'1212', N'BN', N'GE9601', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (539, N'1212', N'BN', N'GE9601', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (540, N'1212', N'BN', N'GE9601', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (541, N'1212', N'BN', N'GE9601', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (542, N'1212', N'BN', N'GE9601', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (543, N'1212', N'BN', N'GE9601', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (544, N'1212', N'BN', N'GE9601', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (545, N'1212', N'BN', N'GE9601', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (546, N'1212', N'BN', N'GE9601', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (547, N'1212', N'BN', N'GE9601', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (548, N'1212', N'BN', N'GE9601', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (549, N'1212', N'BN', N'GE9601', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (550, N'1212', N'BN', N'GE9601', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (551, N'1212', N'BN', N'GE9601', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (552, N'1212', N'BN', N'GE9601', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (553, N'1212', N'BN', N'GE9601', N'1041/AMC110', N'1041AMC110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (554, N'1212', N'BN', N'GE9601', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (555, N'1606', N'BI', N'GE3103', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (556, N'1606', N'BI', N'GE3103', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (557, N'1606', N'BI', N'GE3103', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (558, N'1606', N'BI', N'GE3103', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (559, N'1606', N'BI', N'GE3103', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (560, N'1606', N'BI', N'GE3103', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (561, N'1606', N'BI', N'GE3103', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (562, N'1606', N'BI', N'GE3103', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (563, N'1606', N'BI', N'GE3103', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (564, N'1606', N'BI', N'GE3103', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (565, N'1606', N'BI', N'GE3103', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (566, N'1606', N'BI', N'GE3103', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (567, N'1606', N'BI', N'GE3103', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (568, N'1606', N'BI', N'GE3103', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (569, N'1606', N'BI', N'GE3103', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (570, N'1606', N'BI', N'GE3103', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (571, N'1606', N'BI', N'GE3103', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (572, N'1606', N'BI', N'GE3103', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (573, N'1606', N'BI', N'GE3103', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (574, N'1606', N'BI', N'GE3103', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (575, N'1606', N'BI', N'GE3103', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (576, N'1606', N'BI', N'GE3103', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (577, N'1606', N'BI', N'GE3103', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (578, N'1606', N'BI', N'GE3103', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (579, N'1606', N'BI', N'GE3103', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (580, N'1606', N'BI', N'GE3103', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (581, N'1606', N'BI', N'GE3103', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (582, N'1606', N'BI', N'GE3103', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (583, N'1597', N'BI', N'GE3102', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (584, N'1597', N'BI', N'GE3102', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (585, N'1597', N'BI', N'GE3102', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (586, N'1597', N'BI', N'GE3102', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (587, N'1597', N'BI', N'GE3102', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (588, N'1597', N'BI', N'GE3102', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (589, N'1597', N'BI', N'GE3102', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (590, N'1597', N'BI', N'GE3102', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (591, N'1597', N'BI', N'GE3102', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (592, N'1597', N'BI', N'GE3102', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (593, N'1597', N'BI', N'GE3102', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (594, N'1597', N'BI', N'GE3102', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (595, N'1597', N'BI', N'GE3102', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (596, N'1597', N'BI', N'GE3102', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (597, N'1597', N'BI', N'GE3102', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (598, N'1597', N'BI', N'GE3102', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (599, N'1597', N'BI', N'GE3102', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (600, N'1597', N'BI', N'GE3102', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (601, N'1597', N'BI', N'GE3102', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (602, N'1597', N'BI', N'GE3102', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (603, N'1597', N'BI', N'GE3102', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (604, N'1597', N'BI', N'GE3102', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (605, N'1597', N'BI', N'GE3102', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (606, N'1597', N'BI', N'GE3102', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (607, N'1597', N'BI', N'GE3102', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (608, N'1597', N'BI', N'GE3102', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (609, N'1597', N'BI', N'GE3102', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (610, N'1597', N'BI', N'GE3102', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (611, N'1597', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (612, N'1597', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (613, N'1597', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (614, N'1597', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (615, N'1597', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (616, N'1597', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (617, N'1597', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (618, N'1597', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (619, N'1597', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (620, N'1597', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (621, N'1597', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (622, N'1597', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (623, N'1597', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (624, N'1597', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (625, N'1597', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (626, N'1597', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (627, N'1597', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (628, N'1597', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (629, N'1597', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (630, N'1597', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (631, N'1597', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (632, N'1597', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (633, N'1597', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (634, N'1597', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (635, N'1597', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (636, N'1597', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (637, N'1597', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (638, N'1597', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (639, N'1597', N'BI', N'GE3103', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (640, N'1597', N'BI', N'GE3103', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (641, N'1597', N'BI', N'GE3103', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (642, N'1597', N'BI', N'GE3103', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (643, N'1597', N'BI', N'GE3103', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (644, N'1597', N'BI', N'GE3103', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (645, N'1597', N'BI', N'GE3103', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (646, N'1597', N'BI', N'GE3103', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (647, N'1597', N'BI', N'GE3103', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (648, N'1597', N'BI', N'GE3103', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (649, N'1597', N'BI', N'GE3103', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (650, N'1597', N'BI', N'GE3103', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (651, N'1597', N'BI', N'GE3103', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (652, N'1597', N'BI', N'GE3103', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (653, N'1597', N'BI', N'GE3103', N'1041/AMP510', N'1041AMP510', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (654, N'1597', N'BI', N'GE3103', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (655, N'1597', N'BI', N'GE3103', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (656, N'1597', N'BI', N'GE3103', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (657, N'1597', N'BI', N'GE3103', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (658, N'1597', N'BI', N'GE3103', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (659, N'1597', N'BI', N'GE3103', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (660, N'1597', N'BI', N'GE3103', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (661, N'1597', N'BI', N'GE3103', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (662, N'1597', N'BI', N'GE3103', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (663, N'1597', N'BI', N'GE3103', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (664, N'1597', N'BI', N'GE3103', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (665, N'1597', N'BI', N'GE3103', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (666, N'1597', N'BI', N'GE3103', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (667, N'1809', N'BV', N'GE1403', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (668, N'1809', N'BV', N'GE1403', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (669, N'1809', N'BV', N'GE1403', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (670, N'1809', N'BV', N'GE1403', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (671, N'1809', N'BV', N'GE1403', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (672, N'1809', N'BV', N'GE1403', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (673, N'1809', N'BV', N'GE1403', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (674, N'1809', N'BV', N'GE1403', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (675, N'1809', N'BV', N'GE1403', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (676, N'1809', N'BV', N'GE1403', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (677, N'1809', N'BV', N'GE1403', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (678, N'1809', N'BV', N'GE1403', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (679, N'1809', N'BV', N'GE1403', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (680, N'1809', N'BV', N'GE1403', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (681, N'1809', N'BV', N'GE1403', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (682, N'1809', N'BV', N'GE1403', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (683, N'1809', N'BV', N'GE1403', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (684, N'1809', N'BV', N'GE1403', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (685, N'1809', N'BV', N'GE1403', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (686, N'1809', N'BV', N'GE1403', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (687, N'1809', N'BV', N'GE1403', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (688, N'1809', N'BV', N'GE1403', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (689, N'1809', N'BV', N'GE1403', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (690, N'1809', N'BV', N'GE1403', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (691, N'1809', N'BV', N'GE1403', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (692, N'1809', N'BV', N'GE1403', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (693, N'1809', N'BV', N'GE1403', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (694, N'1809', N'BV', N'GE1403', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (695, N'1212', N'BI', N'GE3101', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (696, N'1212', N'BI', N'GE3101', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (697, N'1212', N'BI', N'GE3101', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (698, N'1212', N'BI', N'GE3101', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (699, N'1212', N'BI', N'GE3101', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (700, N'1212', N'BI', N'GE3101', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (701, N'1212', N'BI', N'GE3101', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (702, N'1212', N'BI', N'GE3101', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (703, N'1212', N'BI', N'GE3101', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (704, N'1212', N'BI', N'GE3101', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (705, N'1212', N'BI', N'GE3101', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (706, N'1212', N'BI', N'GE3101', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (707, N'1212', N'BI', N'GE3101', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (708, N'1212', N'BI', N'GE3101', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (709, N'1212', N'BI', N'GE3101', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (710, N'1212', N'BI', N'GE3101', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (711, N'1212', N'BI', N'GE3101', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (712, N'1212', N'BI', N'GE3101', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (713, N'1212', N'BI', N'GE3101', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (714, N'1212', N'BI', N'GE3101', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (715, N'1212', N'BI', N'GE3101', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (716, N'1212', N'BI', N'GE3101', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (717, N'1212', N'BI', N'GE3101', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (718, N'1212', N'BI', N'GE3101', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (719, N'1212', N'BI', N'GE3101', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (720, N'1212', N'BI', N'GE3101', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (721, N'1212', N'BI', N'GE3101', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (722, N'1212', N'BI', N'GE3101', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (723, N'1212', N'BV', N'GE1402', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (724, N'1212', N'BV', N'GE1402', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (725, N'1212', N'BV', N'GE1402', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (726, N'1212', N'BV', N'GE1402', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (727, N'1212', N'BV', N'GE1402', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (728, N'1212', N'BV', N'GE1402', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (729, N'1212', N'BV', N'GE1402', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (730, N'1212', N'BV', N'GE1402', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (731, N'1212', N'BV', N'GE1402', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (732, N'1212', N'BV', N'GE1402', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (733, N'1212', N'BV', N'GE1402', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (734, N'1212', N'BV', N'GE1402', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (735, N'1212', N'BV', N'GE1402', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (736, N'1212', N'BV', N'GE1402', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (737, N'1212', N'BV', N'GE1402', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (738, N'1212', N'BV', N'GE1402', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (739, N'1212', N'BV', N'GE1402', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (740, N'1212', N'BV', N'GE1402', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (741, N'1212', N'BV', N'GE1402', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (742, N'1212', N'BV', N'GE1402', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (743, N'1212', N'BV', N'GE1402', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (744, N'1212', N'BV', N'GE1402', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (745, N'1212', N'BV', N'GE1402', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (746, N'1212', N'BV', N'GE1402', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (747, N'1212', N'BV', N'GE1402', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (748, N'1212', N'BV', N'GE1402', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (749, N'1212', N'BV', N'GE1402', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (750, N'1212', N'BV', N'GE1402', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (751, N'1594', N'BP', N'GE1104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (752, N'1594', N'BP', N'GE1104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (753, N'1594', N'BP', N'GE1104', N'1041/AMB510', N'1041AMB510', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (754, N'1594', N'BP', N'GE1104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (755, N'1594', N'BP', N'GE1104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (756, N'1594', N'BP', N'GE1104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (757, N'1594', N'BP', N'GE1104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (758, N'1594', N'BP', N'GE1104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (759, N'1594', N'BP', N'GE1104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (760, N'1594', N'BP', N'GE1104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (761, N'1594', N'BP', N'GE1104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (762, N'1594', N'BP', N'GE1104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (763, N'1594', N'BP', N'GE1104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (764, N'1594', N'BP', N'GE1104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (765, N'1594', N'BP', N'GE1104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (766, N'1594', N'BP', N'GE1104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (767, N'1594', N'BP', N'GE1104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (768, N'1594', N'BP', N'GE1104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (769, N'1594', N'BP', N'GE1104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (770, N'1594', N'BP', N'GE1104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (771, N'1594', N'BP', N'GE1104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (772, N'1594', N'BP', N'GE1104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (773, N'1594', N'BP', N'GE1104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (774, N'1594', N'BP', N'GE1104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (775, N'1594', N'BP', N'GE1104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (776, N'1594', N'BP', N'GE1104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (777, N'1594', N'BP', N'GE1104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (778, N'1594', N'BP', N'GE1104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (779, N'1783', N'BP', N'GE1104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (780, N'1783', N'BP', N'GE1104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (781, N'1783', N'BP', N'GE1104', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (782, N'1783', N'BP', N'GE1104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (783, N'1783', N'BP', N'GE1104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (784, N'1783', N'BP', N'GE1104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (785, N'1783', N'BP', N'GE1104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (786, N'1783', N'BP', N'GE1104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (787, N'1783', N'BP', N'GE1104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (788, N'1783', N'BP', N'GE1104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (789, N'1783', N'BP', N'GE1104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (790, N'1783', N'BP', N'GE1104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (791, N'1783', N'BP', N'GE1104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (792, N'1783', N'BP', N'GE1104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (793, N'1783', N'BP', N'GE1104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (794, N'1783', N'BP', N'GE1104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (795, N'1783', N'BP', N'GE1104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (796, N'1783', N'BP', N'GE1104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (797, N'1783', N'BP', N'GE1104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (798, N'1783', N'BP', N'GE1104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (799, N'1783', N'BP', N'GE1104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (800, N'1783', N'BP', N'GE1104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (801, N'1783', N'BP', N'GE1104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (802, N'1783', N'BP', N'GE1104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (803, N'1783', N'BP', N'GE1104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (804, N'1783', N'BP', N'GE1104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (805, N'1783', N'BP', N'GE1104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (806, N'1783', N'BP', N'GE1104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (807, N'1783', N'BP', N'GE1112', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (808, N'1783', N'BP', N'GE1112', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (809, N'1783', N'BP', N'GE1112', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (810, N'1783', N'BP', N'GE1112', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (811, N'1783', N'BP', N'GE1112', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (812, N'1783', N'BP', N'GE1112', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (813, N'1783', N'BP', N'GE1112', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (814, N'1783', N'BP', N'GE1112', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (815, N'1783', N'BP', N'GE1112', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (816, N'1783', N'BP', N'GE1112', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (817, N'1783', N'BP', N'GE1112', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (818, N'1783', N'BP', N'GE1112', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (819, N'1783', N'BP', N'GE1112', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (820, N'1783', N'BP', N'GE1112', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (821, N'1783', N'BP', N'GE1112', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (822, N'1783', N'BP', N'GE1112', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (823, N'1783', N'BP', N'GE1112', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (824, N'1783', N'BP', N'GE1112', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (825, N'1783', N'BP', N'GE1112', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (826, N'1783', N'BP', N'GE1112', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (827, N'1783', N'BP', N'GE1112', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (828, N'1783', N'BP', N'GE1112', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (829, N'1783', N'BP', N'GE1112', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (830, N'1783', N'BP', N'GE1112', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (831, N'1783', N'BP', N'GE1112', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (832, N'1783', N'BP', N'GE1112', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (833, N'1783', N'BP', N'GE1112', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (834, N'1783', N'BP', N'GE1112', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (835, N'1633', N'BP', N'GE1112', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (836, N'1633', N'BP', N'GE1112', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (837, N'1633', N'BP', N'GE1112', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (838, N'1633', N'BP', N'GE1112', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (839, N'1633', N'BP', N'GE1112', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (840, N'1633', N'BP', N'GE1112', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (841, N'1633', N'BP', N'GE1112', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (842, N'1633', N'BP', N'GE1112', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (843, N'1633', N'BP', N'GE1112', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (844, N'1633', N'BP', N'GE1112', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (845, N'1633', N'BP', N'GE1112', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (846, N'1633', N'BP', N'GE1112', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (847, N'1633', N'BP', N'GE1112', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (848, N'1633', N'BP', N'GE1112', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (849, N'1633', N'BP', N'GE1112', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (850, N'1633', N'BP', N'GE1112', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (851, N'1633', N'BP', N'GE1112', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (852, N'1633', N'BP', N'GE1112', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (853, N'1633', N'BP', N'GE1112', N'1041/AMA710', N'1041AMA710', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (854, N'1633', N'BP', N'GE1112', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (855, N'1633', N'BP', N'GE1112', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (856, N'1633', N'BP', N'GE1112', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (857, N'1633', N'BP', N'GE1112', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (858, N'1633', N'BP', N'GE1112', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (859, N'1633', N'BP', N'GE1112', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (860, N'1633', N'BP', N'GE1112', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (861, N'1633', N'BP', N'GE1112', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (862, N'1633', N'BP', N'GE1112', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (863, N'1212', N'BI', N'GE3105', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (864, N'1212', N'BI', N'GE3105', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (865, N'1212', N'BI', N'GE3105', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (866, N'1212', N'BI', N'GE3105', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (867, N'1212', N'BI', N'GE3105', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (868, N'1212', N'BI', N'GE3105', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (869, N'1212', N'BI', N'GE3105', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (870, N'1212', N'BI', N'GE3105', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (871, N'1212', N'BI', N'GE3105', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (872, N'1212', N'BI', N'GE3105', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (873, N'1212', N'BI', N'GE3105', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (874, N'1212', N'BI', N'GE3105', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (875, N'1212', N'BI', N'GE3105', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (876, N'1212', N'BI', N'GE3105', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (877, N'1212', N'BI', N'GE3105', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (878, N'1212', N'BI', N'GE3105', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (879, N'1212', N'BI', N'GE3105', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (880, N'1212', N'BI', N'GE3105', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (881, N'1212', N'BI', N'GE3105', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (882, N'1212', N'BI', N'GE3105', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (883, N'1212', N'BI', N'GE3105', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (884, N'1212', N'BI', N'GE3105', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (885, N'1212', N'BI', N'GE3105', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (886, N'1212', N'BI', N'GE3105', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (887, N'1212', N'BI', N'GE3105', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (888, N'1212', N'BI', N'GE3105', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (889, N'1212', N'BI', N'GE3105', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (890, N'1212', N'BI', N'GE3105', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (919, N'1600', N'BV', N'GE1402', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (920, N'1600', N'BV', N'GE1402', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (921, N'1600', N'BV', N'GE1402', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (922, N'1600', N'BV', N'GE1402', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (923, N'1600', N'BV', N'GE1402', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (924, N'1600', N'BV', N'GE1402', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (925, N'1600', N'BV', N'GE1402', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (926, N'1600', N'BV', N'GE1402', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (927, N'1600', N'BV', N'GE1402', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (928, N'1600', N'BV', N'GE1402', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (929, N'1600', N'BV', N'GE1402', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (930, N'1600', N'BV', N'GE1402', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (931, N'1600', N'BV', N'GE1402', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (932, N'1600', N'BV', N'GE1402', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (933, N'1600', N'BV', N'GE1402', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (934, N'1600', N'BV', N'GE1402', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (935, N'1600', N'BV', N'GE1402', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (936, N'1600', N'BV', N'GE1402', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (937, N'1600', N'BV', N'GE1402', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (938, N'1600', N'BV', N'GE1402', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (939, N'1600', N'BV', N'GE1402', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (940, N'1600', N'BV', N'GE1402', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (941, N'1600', N'BV', N'GE1402', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (942, N'1600', N'BV', N'GE1402', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (943, N'1600', N'BV', N'GE1402', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (944, N'1600', N'BV', N'GE1402', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (945, N'1600', N'BV', N'GE1402', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (946, N'1600', N'BV', N'GE1402', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (947, N'1784', N'BP', N'GE1112', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (948, N'1784', N'BP', N'GE1112', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (949, N'1784', N'BP', N'GE1112', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (950, N'1784', N'BP', N'GE1112', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (951, N'1784', N'BP', N'GE1112', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (952, N'1784', N'BP', N'GE1112', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (953, N'1784', N'BP', N'GE1112', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (954, N'1784', N'BP', N'GE1112', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (955, N'1784', N'BP', N'GE1112', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (956, N'1784', N'BP', N'GE1112', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (957, N'1784', N'BP', N'GE1112', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (958, N'1784', N'BP', N'GE1112', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (959, N'1784', N'BP', N'GE1112', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (960, N'1784', N'BP', N'GE1112', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (961, N'1784', N'BP', N'GE1112', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (962, N'1784', N'BP', N'GE1112', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (963, N'1784', N'BP', N'GE1112', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (964, N'1784', N'BP', N'GE1112', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (965, N'1784', N'BP', N'GE1112', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (966, N'1784', N'BP', N'GE1112', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (967, N'1784', N'BP', N'GE1112', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (968, N'1784', N'BP', N'GE1112', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (969, N'1784', N'BP', N'GE1112', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (970, N'1784', N'BP', N'GE1112', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (971, N'1784', N'BP', N'GE1112', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (972, N'1784', N'BP', N'GE1112', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (973, N'1784', N'BP', N'GE1112', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (974, N'1784', N'BP', N'GE1112', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (975, N'1784', N'BP', N'GE1109', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (976, N'1784', N'BP', N'GE1109', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (977, N'1784', N'BP', N'GE1109', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (978, N'1784', N'BP', N'GE1109', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (979, N'1784', N'BP', N'GE1109', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (980, N'1784', N'BP', N'GE1109', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (981, N'1784', N'BP', N'GE1109', N'1041/KML110', N'1041KML110', 0);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (982, N'1784', N'BP', N'GE1109', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (983, N'1784', N'BP', N'GE1109', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (984, N'1784', N'BP', N'GE1109', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (985, N'1784', N'BP', N'GE1109', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (986, N'1784', N'BP', N'GE1109', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (987, N'1784', N'BP', N'GE1109', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (988, N'1784', N'BP', N'GE1109', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (989, N'1784', N'BP', N'GE1109', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (990, N'1784', N'BP', N'GE1109', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (991, N'1784', N'BP', N'GE1109', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (992, N'1784', N'BP', N'GE1109', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (993, N'1784', N'BP', N'GE1109', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (994, N'1784', N'BP', N'GE1109', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (995, N'1784', N'BP', N'GE1109', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (996, N'1784', N'BP', N'GE1109', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (997, N'1784', N'BP', N'GE1109', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (998, N'1784', N'BP', N'GE1109', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (999, N'1784', N'BP', N'GE1109', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1000, N'1784', N'BP', N'GE1109', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1001, N'1784', N'BP', N'GE1109', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1002, N'1784', N'BP', N'GE1109', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1003, N'1784', N'BP', N'GE1132', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1004, N'1784', N'BP', N'GE1132', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1005, N'1784', N'BP', N'GE1132', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1006, N'1784', N'BP', N'GE1132', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1007, N'1784', N'BP', N'GE1132', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1008, N'1784', N'BP', N'GE1132', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1009, N'1784', N'BP', N'GE1132', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1010, N'1784', N'BP', N'GE1132', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1011, N'1784', N'BP', N'GE1132', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1012, N'1784', N'BP', N'GE1132', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1013, N'1784', N'BP', N'GE1132', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1014, N'1784', N'BP', N'GE1132', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1015, N'1784', N'BP', N'GE1132', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1016, N'1784', N'BP', N'GE1132', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1017, N'1784', N'BP', N'GE1132', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1018, N'1784', N'BP', N'GE1132', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1019, N'1784', N'BP', N'GE1132', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1020, N'1784', N'BP', N'GE1132', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1021, N'1784', N'BP', N'GE1132', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1022, N'1784', N'BP', N'GE1132', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1023, N'1784', N'BP', N'GE1132', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1024, N'1784', N'BP', N'GE1132', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1025, N'1784', N'BP', N'GE1132', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1026, N'1784', N'BP', N'GE1132', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1027, N'1784', N'BP', N'GE1132', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1028, N'1784', N'BP', N'GE1132', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1029, N'1784', N'BP', N'GE1132', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1030, N'1784', N'BP', N'GE1132', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1031, N'1269', N'BP', N'GE1104', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1032, N'1269', N'BP', N'GE1104', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1033, N'1269', N'BP', N'GE1104', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1034, N'1269', N'BP', N'GE1104', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1035, N'1269', N'BP', N'GE1104', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1036, N'1269', N'BP', N'GE1104', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1037, N'1269', N'BP', N'GE1104', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1038, N'1269', N'BP', N'GE1104', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1039, N'1269', N'BP', N'GE1104', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1040, N'1269', N'BP', N'GE1104', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1041, N'1269', N'BP', N'GE1104', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1042, N'1269', N'BP', N'GE1104', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1043, N'1269', N'BP', N'GE1104', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1044, N'1269', N'BP', N'GE1104', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1045, N'1269', N'BP', N'GE1104', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1046, N'1269', N'BP', N'GE1104', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1047, N'1269', N'BP', N'GE1104', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1048, N'1269', N'BP', N'GE1104', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1049, N'1269', N'BP', N'GE1104', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1050, N'1269', N'BP', N'GE1104', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1051, N'1269', N'BP', N'GE1104', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1052, N'1269', N'BP', N'GE1104', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1053, N'1269', N'BP', N'GE1104', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1054, N'1269', N'BP', N'GE1104', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1055, N'1269', N'BP', N'GE1104', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1056, N'1269', N'BP', N'GE1104', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1057, N'1269', N'BP', N'GE1104', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1058, N'1269', N'BP', N'GE1104', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1059, N'1212', N'BQ', N'GE1302', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1060, N'1212', N'BQ', N'GE1302', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1061, N'1212', N'BQ', N'GE1302', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1062, N'1212', N'BQ', N'GE1302', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1063, N'1212', N'BQ', N'GE1302', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1064, N'1212', N'BQ', N'GE1302', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1065, N'1212', N'BQ', N'GE1302', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1066, N'1212', N'BQ', N'GE1302', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1067, N'1212', N'BQ', N'GE1302', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1068, N'1212', N'BQ', N'GE1302', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1069, N'1212', N'BQ', N'GE1302', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1070, N'1212', N'BQ', N'GE1302', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1071, N'1212', N'BQ', N'GE1302', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1072, N'1212', N'BQ', N'GE1302', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1073, N'1212', N'BQ', N'GE1302', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1074, N'1212', N'BQ', N'GE1302', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1075, N'1212', N'BQ', N'GE1302', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1076, N'1212', N'BQ', N'GE1302', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1077, N'1212', N'BQ', N'GE1302', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1078, N'1212', N'BQ', N'GE1302', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1079, N'1212', N'BQ', N'GE1302', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1080, N'1212', N'BQ', N'GE1302', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1081, N'1212', N'BQ', N'GE1302', N'1041/AMG110', N'1041AMG110', 1);
GO
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1082, N'1212', N'BQ', N'GE1302', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1083, N'1212', N'BQ', N'GE1302', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1084, N'1212', N'BQ', N'GE1302', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1085, N'1212', N'BQ', N'GE1302', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1086, N'1212', N'BQ', N'GE1302', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1087, N'1805', N'BP', N'GE1138', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1088, N'1805', N'BP', N'GE1138', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1089, N'1805', N'BP', N'GE1138', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1090, N'1805', N'BP', N'GE1138', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1091, N'1805', N'BP', N'GE1138', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1092, N'1805', N'BP', N'GE1138', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1093, N'1805', N'BP', N'GE1138', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1094, N'1805', N'BP', N'GE1138', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1095, N'1805', N'BP', N'GE1138', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1096, N'1805', N'BP', N'GE1138', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1097, N'1805', N'BP', N'GE1138', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1098, N'1805', N'BP', N'GE1138', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1099, N'1805', N'BP', N'GE1138', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1100, N'1805', N'BP', N'GE1138', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1101, N'1805', N'BP', N'GE1138', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1102, N'1805', N'BP', N'GE1138', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1103, N'1805', N'BP', N'GE1138', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1104, N'1805', N'BP', N'GE1138', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1105, N'1805', N'BP', N'GE1138', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1106, N'1805', N'BP', N'GE1138', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1107, N'1805', N'BP', N'GE1138', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1108, N'1805', N'BP', N'GE1138', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1109, N'1805', N'BP', N'GE1138', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1110, N'1805', N'BP', N'GE1138', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1111, N'1805', N'BP', N'GE1138', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1112, N'1805', N'BP', N'GE1138', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1113, N'1805', N'BP', N'GE1138', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1114, N'1805', N'BP', N'GE1138', N'1041/AMK110', N'1041AMK110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1115, N'1805', N'BP', N'GE1136', N'1041/AMQ110', N'1041AMQ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1116, N'1805', N'BP', N'GE1136', N'1041/AMS110', N'1041AMS110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1117, N'1805', N'BP', N'GE1136', N'1041/AMB510', N'1041AMB510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1118, N'1805', N'BP', N'GE1136', N'1041/AMF110', N'1041AMF110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1119, N'1805', N'BP', N'GE1136', N'1041/AMJ510', N'1041AMJ510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1120, N'1805', N'BP', N'GE1136', N'1041/AMF510', N'1041AMF510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1121, N'1805', N'BP', N'GE1136', N'1041/KML110', N'1041KML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1122, N'1805', N'BP', N'GE1136', N'1041/AMD510', N'1041AMD510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1123, N'1805', N'BP', N'GE1136', N'1041/AML110', N'1041AML110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1124, N'1805', N'BP', N'GE1136', N'1041/AMN510', N'1041AMN510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1125, N'1805', N'BP', N'GE1136', N'1041/AMB110', N'1041AMB110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1126, N'1805', N'BP', N'GE1136', N'1041/AML510', N'1041AML510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1127, N'1805', N'BP', N'GE1136', N'1041/AMN110', N'1041AMN110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1128, N'1805', N'BP', N'GE1136', N'1041/AMH110', N'1041AMH110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1129, N'1805', N'BP', N'GE1136', N'1041/AMP510', N'1041AMP510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1130, N'1805', N'BP', N'GE1136', N'1041/AMJ110', N'1041AMJ110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1131, N'1805', N'BP', N'GE1136', N'1041/AMR510', N'1041AMR510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1132, N'1805', N'BP', N'GE1136', N'1041/AMP110', N'1041AMP110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1133, N'1805', N'BP', N'GE1136', N'1041/AMA710', N'1041AMA710', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1134, N'1805', N'BP', N'GE1136', N'1041/AMR110', N'1041AMR110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1135, N'1805', N'BP', N'GE1136', N'1041/AMA510', N'1041AMA510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1136, N'1805', N'BP', N'GE1136', N'1041/AMC510', N'1041AMC510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1137, N'1805', N'BP', N'GE1136', N'1041/AMG110', N'1041AMG110', 1);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1138, N'1805', N'BP', N'GE1136', N'1041/AME110', N'1041AME110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1139, N'1805', N'BP', N'GE1136', N'1041/AMK510', N'1041AMK510', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1140, N'1805', N'BP', N'GE1136', N'1041/AMA110', N'1041AMA110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1141, N'1805', N'BP', N'GE1136', N'1041/AMC110', N'1041AMC110', 0);
INSERT bomb_macs5.workcenter (id, projectid, sectorid, subsectorid, title, wcnumber, csd) VALUES (1142, N'1805', N'BP', N'GE1136', N'1041/AMK110', N'1041AMK110', 0);
SET IDENTITY_INSERT [dbo].[workcenter] OFF
ALTER TABLE [dbo].[cahier]  WITH CHECK ADD  CONSTRAINT [FK_3a5en265j49w492gawi3113m3] FOREIGN KEY([workcenter_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[cahier] CHECK CONSTRAINT [FK_3a5en265j49w492gawi3113m3]
GO
ALTER TABLE [dbo].[cahier]  WITH CHECK ADD  CONSTRAINT [FK_8rta629bkn83rhq3otyt8bb8g] FOREIGN KEY([objectdependency_id])
REFERENCES [dbo].[objectdependency] ([id])
GO
ALTER TABLE [dbo].[cahier] CHECK CONSTRAINT [FK_8rta629bkn83rhq3otyt8bb8g]
GO
ALTER TABLE [dbo].[cahier]  WITH CHECK ADD  CONSTRAINT [FK_jutmjgdk514mm5jely508emdy] FOREIGN KEY([jalon_id])
REFERENCES [dbo].[jalon] ([id])
GO
ALTER TABLE [dbo].[cahier] CHECK CONSTRAINT [FK_jutmjgdk514mm5jely508emdy]
GO
ALTER TABLE [dbo].[cahierdrawing]  WITH CHECK ADD  CONSTRAINT [FK_5fsc7tnutk3higlmpyr20x1jp] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[cahier] ([id])
GO
ALTER TABLE [dbo].[cahierdrawing] CHECK CONSTRAINT [FK_5fsc7tnutk3higlmpyr20x1jp]
GO
ALTER TABLE [dbo].[cahiertool]  WITH CHECK ADD  CONSTRAINT [FK_8hadvxa986teftjrbv7iadkg4] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[cahier] ([id])
GO
ALTER TABLE [dbo].[cahiertool] CHECK CONSTRAINT [FK_8hadvxa986teftjrbv7iadkg4]
GO
ALTER TABLE [dbo].[cahierupdatedpart]  WITH CHECK ADD  CONSTRAINT [FK_9hpwwxhysk6m97kqja779j2c6] FOREIGN KEY([part_id])
REFERENCES [dbo].[part] ([id])
GO
ALTER TABLE [dbo].[cahierupdatedpart] CHECK CONSTRAINT [FK_9hpwwxhysk6m97kqja779j2c6]
GO
ALTER TABLE [dbo].[dda]  WITH CHECK ADD  CONSTRAINT [FK_c7275f9btgvs1mdmi6b01l2yc] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[dda] CHECK CONSTRAINT [FK_c7275f9btgvs1mdmi6b01l2yc]
GO
ALTER TABLE [dbo].[drawing]  WITH CHECK ADD  CONSTRAINT [FK_k70uor07d314w0yd3ebfpjc8h] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[drawing] CHECK CONSTRAINT [FK_k70uor07d314w0yd3ebfpjc8h]
GO
ALTER TABLE [dbo].[jalon]  WITH CHECK ADD  CONSTRAINT [FK_qa2fmgvmjnyfbuwnvak3a8lle] FOREIGN KEY([workcenter_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[jalon] CHECK CONSTRAINT [FK_qa2fmgvmjnyfbuwnvak3a8lle]
GO
ALTER TABLE [dbo].[masterpart]  WITH CHECK ADD  CONSTRAINT [FK_6lmmmp2g1gojfg20i92xkwxf9] FOREIGN KEY([workcenter_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[masterpart] CHECK CONSTRAINT [FK_6lmmmp2g1gojfg20i92xkwxf9]
GO
ALTER TABLE [dbo].[masterpart]  WITH CHECK ADD  CONSTRAINT [FK_8lxeo2wtmrhsnoe1j00t5daby] FOREIGN KEY([parent_id])
REFERENCES [dbo].[masterpart] ([id])
GO
ALTER TABLE [dbo].[masterpart] CHECK CONSTRAINT [FK_8lxeo2wtmrhsnoe1j00t5daby]
GO
ALTER TABLE [dbo].[masterpart]  WITH CHECK ADD  CONSTRAINT [FK_hwqwmpmpiuwf74cyungd4yxrx] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[cahier] ([id])
GO
ALTER TABLE [dbo].[masterpart] CHECK CONSTRAINT [FK_hwqwmpmpiuwf74cyungd4yxrx]
GO
ALTER TABLE [dbo].[part]  WITH CHECK ADD  CONSTRAINT [FK_n8orxqij8odybnlu5seqb1659] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[cahier] ([id])
GO
ALTER TABLE [dbo].[part] CHECK CONSTRAINT [FK_n8orxqij8odybnlu5seqb1659]
GO
ALTER TABLE [dbo].[part]  WITH CHECK ADD  CONSTRAINT [FK_sat1xfoja0l8qp9fr57k57cyl] FOREIGN KEY([parent_id])
REFERENCES [dbo].[part] ([id])
GO
ALTER TABLE [dbo].[part] CHECK CONSTRAINT [FK_sat1xfoja0l8qp9fr57k57cyl]
GO
ALTER TABLE [dbo].[part]  WITH CHECK ADD  CONSTRAINT [FK_soa1k9qlqve4minou18rjdnl2] FOREIGN KEY([workcenter_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[part] CHECK CONSTRAINT [FK_soa1k9qlqve4minou18rjdnl2]
GO
ALTER TABLE [dbo].[string]  WITH CHECK ADD  CONSTRAINT [FK_qfceutga9avttkkeeoijkbqd5] FOREIGN KEY([cahier_id])
REFERENCES [dbo].[workcenter] ([id])
GO
ALTER TABLE [dbo].[string] CHECK CONSTRAINT [FK_qfceutga9avttkkeeoijkbqd5]
GO

*/

















