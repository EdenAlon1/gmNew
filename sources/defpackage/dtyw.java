package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dtyw {
    private final dtry a;
    private final boolean b;

    protected dtyw(dtry dtryVar, boolean z) {
        this.a = dtryVar;
        this.b = z;
    }

    public final String a() {
        return this.a.toString().concat(true != this.b ? " DESC" : " ASC");
    }
}
