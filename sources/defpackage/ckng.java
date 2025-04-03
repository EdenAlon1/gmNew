package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum ckng {
    NAME_CHANGE(0),
    REMOVE_USER_BY_ALL(1),
    REMOVE_USER_BY_ADMIN(2),
    ICON_CHANGE(3);

    final long e;

    ckng(int i) {
        emxf.a(true);
        this.e = 1 << i;
    }
}
