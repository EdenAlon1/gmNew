package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywp {
    public static final String[] a = {"id", "message_id", "message_type", "sender_contact_row_id", "conversation_row_id", "server_timestamp_us", "message_properties", "message_status", "needs_delivery_receipt", "capability", "rendering_type", "filterable_flags"};
    public static final String b = "CREATE TABLE messages (id INTEGER PRIMARY KEY,message_id TEXT UNIQUE NOT NULL,message_type INTEGER NOT NULL,sender_contact_row_id INTEGER NOT NULL,conversation_row_id INTEGER NOT NULL,server_timestamp_us INTEGER NOT NULL,message_properties BLOB NOT NULL,message_status INTEGER NOT NULL,capability INTEGER NOT NULL default -1,rendering_type INTEGER NOT NULL default " + dzqr.DEFAULT_RENDERING_TYPE.f + ",needs_delivery_receipt INTEGER NOT NULL default 0,filterable_flags INTEGER NOT NULL default 0, FOREIGN KEY(sender_contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE)";
}
