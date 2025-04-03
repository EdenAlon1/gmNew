package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enwr {
    public final int a;
    public final enti b;

    protected enwr(enti entiVar, int i) {
        if (entiVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "invalid index: "));
        }
        this.a = i;
        this.b = entiVar;
    }

    public abstract void a(enws enwsVar, Object obj);
}
