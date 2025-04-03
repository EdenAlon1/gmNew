package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbou extends ffah {
    public fbou(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new fbou(fdxkVar, fdxjVar);
    }

    public final void b(fcat fcatVar, ffbc ffbcVar) {
        febs febsVar = fbov.a;
        if (febsVar == null) {
            synchronized (fbov.class) {
                febsVar = fbov.a;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.SERVER_STREAMING;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessages");
                    a.b();
                    fcat fcatVar2 = fcat.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcatVar2);
                    a.b = new ffae(fcbj.a);
                    febsVar = a.a();
                    fbov.a = febsVar;
                }
            }
        }
        fdxo a2 = this.a.a(febsVar, this.b);
        fdxi fdxiVar = ffat.a;
        ffbcVar.getClass();
        ffat.b(a2, fcatVar, new ffaq(ffbcVar, new ffan(a2)));
    }
}
