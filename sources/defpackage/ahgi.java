package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgi {
    public static final String[] a = {"conversations._id", "conversations.sort_timestamp", "conversation_pin.pin_status"};
    public static final enhk b = new enhd().c();
    public static final ahfw c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("sort_timestamp", "index_null_sort_timestamp");
        enhdVar.c();
        c = new ahfw();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(a().P().a());
    }
}
