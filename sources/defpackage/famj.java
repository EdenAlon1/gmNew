package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class famj extends ffai {
    public famj(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new famj(fdxkVar, fdxjVar);
    }

    public final ListenableFuture b(famq famqVar) {
        febs febsVar = famk.a;
        if (febsVar == null) {
            synchronized (famk.class) {
                febsVar = famk.a;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("mdi.aratea.ArateaService", "Generate");
                    a.b();
                    famq famqVar2 = famq.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(famqVar2);
                    a.b = new ffae(fams.a);
                    febsVar = a.a();
                    famk.a = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), famqVar);
    }
}
