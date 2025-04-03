package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbkf extends ffai {
    public fbkf(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new fbkf(fdxkVar, fdxjVar);
    }

    public final ListenableFuture b(ezjl ezjlVar) {
        febs febsVar = fbkg.a;
        if (febsVar == null) {
            synchronized (fbkg.class) {
                febsVar = fbkg.a;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterFrontend", "SendLighterMessage");
                    a.b();
                    ezjl ezjlVar2 = ezjl.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(ezjlVar2);
                    a.b = new ffae(ezjn.a);
                    febsVar = a.a();
                    fbkg.a = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), ezjlVar);
    }
}
