package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqm extends ffai {
    public fbqm(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new fbqm(fdxkVar, fdxjVar);
    }

    public final ListenableFuture b(fbdh fbdhVar) {
        febs febsVar = fbqn.a;
        if (febsVar == null) {
            synchronized (fbqn.class) {
                febsVar = fbqn.a;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.SmartMessaging", "GetContentDecoration");
                    a.b();
                    fbdh fbdhVar2 = fbdh.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fbdhVar2);
                    a.b = new ffae(fbdj.a);
                    febsVar = a.a();
                    fbqn.a = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fbdhVar);
    }
}
