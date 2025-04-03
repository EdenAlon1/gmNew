package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhm {
    public static final enhk a;
    public final ffbr b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("/bugle/rpc/update_data/", 1);
        enhdVar.k("/bugle/rpc/call_contact/", 2);
        enhdVar.k("/bugle/rpc/send_message/", 3);
        enhdVar.k("/bugle/rpc/create_conversation/", 4);
        enhdVar.k("/bugle/rpc/mark_as_read/", 5);
        enhdVar.k("/bugle/rpc/open_conversation/", 6);
        enhdVar.k("/bugle/rpc/resend_message/", 7);
        enhdVar.k("/bugle/rpc/delete_message/", 8);
        enhdVar.k("/bugle/rpc/download_message/", 9);
        enhdVar.k("/bugle/rpc/delete_conversation/", 10);
        enhdVar.k("/bugle/rpc/request_more_messages/", 11);
        enhdVar.k("/bugle/rpc/more_messages/", 12);
        a = enhdVar.c();
    }

    public cvhm(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Deprecated
    public final void a(String str) {
        ((akzt) this.b.b()).e("Bugle.Wear.Rpc.Incoming.Count", ((Integer) a.getOrDefault(str, 0)).intValue());
    }
}
