package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwql {
    public dwqm a;
    public String b;
    public Throwable c;
    public int d;

    public final dwqn a() {
        dwqm dwqmVar = this.a;
        dwqmVar.getClass();
        if (this.b == null) {
            this.b = "Download result code: ".concat(String.valueOf(dwqmVar.name()));
        }
        return new dwqn(this);
    }
}
