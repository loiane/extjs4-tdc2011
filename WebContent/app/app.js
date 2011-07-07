/**
 * Ext JS Library 4.0.0
 * Copyright(c) 2006-2011 Sencha Inc.
 * licensing@sencha.com
 * http://www.sencha.com/license
 *	
 * Projeto Exemplo apresentado no TDC 2011
 * The Developer's Conference
 * Sao Paulo - SP - 6 a 10 de Julho de 2011
 * http://www.thedevelopersconference.com.br/
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
Ext.application({
    name: 'TDC2011',

    controllers: [
        'Contacts'
    ],

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    xtype: 'contactlist'
                }
            ]
        });
    }
});
