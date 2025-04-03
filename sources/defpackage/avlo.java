package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class avlo extends Exception {
    public final boolean a;
    public int b;

    public avlo(String str) {
        super(str);
        this.b = -1;
        this.a = false;
    }

    public avlo(String str, int i, boolean z) {
        super(str);
        this.a = z;
        this.b = i;
    }

    public avlo(String str, Throwable th) {
        this(str, th, false);
    }

    public avlo(String str, Throwable th, boolean z) {
        super(str, th);
        this.b = -1;
        this.a = z;
    }
}
