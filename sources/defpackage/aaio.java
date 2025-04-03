package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaio {
    private final ffbr a;

    public aaio(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final boolean a() {
        Long l = (Long) this.a.b();
        if (l != null && l.longValue() == 1) {
            return true;
        }
        return l != null && l.longValue() == 2;
    }
}
