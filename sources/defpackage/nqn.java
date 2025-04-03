package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqn {
    public final engw a;
    public final boolean b;

    public nqn(nqm nqmVar) {
        this.a = nqmVar.a.g();
        lti.b(!r2.isEmpty(), "The sequence must contain at least one EditedMediaItem.");
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean a() {
        int i = 0;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                return false;
            }
            if (((nql) engwVar.get(i)).b()) {
                return true;
            }
            i++;
        }
    }
}
