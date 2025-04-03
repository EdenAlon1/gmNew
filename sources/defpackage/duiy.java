package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duiy implements fdxp {
    private static duiy a;
    private final emyl b;

    public duiy(emyl emylVar) {
        this.b = emylVar;
    }

    public static synchronized duiy b() {
        duiy duiyVar;
        synchronized (duiy.class) {
            if (a == null) {
                a = new duiy(new emyl() { // from class: duis
                    @Override // defpackage.emyl
                    public final Object get() {
                        return true;
                    }
                });
            }
            duiyVar = a;
        }
        return duiyVar;
    }

    @Override // defpackage.fdxp
    public final fdxo a(febs febsVar, fdxj fdxjVar, fdxk fdxkVar) {
        duix duixVar;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return fdxkVar.a(febsVar, fdxjVar);
        }
        ecda ecdaVar = (ecda) fdxjVar.h(duio.a);
        if (ecdaVar == null) {
            duixVar = new duix(new ecou("https://" + fdxkVar.b() + "/" + febsVar.b));
        } else {
            duixVar = new duix(ecou.a(fdxkVar.b(), ecdaVar));
        }
        return new duiu(fdxkVar.a(febsVar, fdxjVar.g(duixVar)), duixVar);
    }
}
