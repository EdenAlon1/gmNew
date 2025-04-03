package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxb {
    public final Context a;
    public final zvo b;
    public final aigz c;
    public final aaka d;
    public final askd e;
    public final asnh f;
    public final athc g;
    public final alye h;
    private final ffhd i;
    private final Conversation j;
    private final LruCache k;

    public zxb(Context context, ffhd ffhdVar, zvo zvoVar, aigz aigzVar, Conversation conversation, aaka aakaVar, askd askdVar, asnh asnhVar, athc athcVar) {
        context.getClass();
        ffhdVar.getClass();
        aigzVar.getClass();
        conversation.getClass();
        askdVar.getClass();
        this.a = context;
        this.i = ffhdVar;
        this.b = zvoVar;
        this.c = aigzVar;
        this.j = conversation;
        this.d = aakaVar;
        this.e = askdVar;
        this.f = asnhVar;
        this.g = athcVar;
        this.k = new LruCache(100);
        this.h = conversation.c();
    }

    public final axrc a(ffsk ffskVar, final zwt zwtVar) {
        fgcm fgcmVar;
        Uri e = zwtVar.a.e();
        dlzf dlzfVar = new dlzf(new dlvv(zwtVar.c), new dlze(this.f.a(), this.g.a()), zwtVar.c, zwtVar.b, new ffix() { // from class: zww
            @Override // defpackage.ffix
            public final Object invoke() {
                zxb.this.c.h(new ainx(zwtVar.a.e()));
                return true;
            }
        }, new ffix() { // from class: zwx
            @Override // defpackage.ffix
            public final Object invoke() {
                zxb.this.h.J(zwtVar.d, 2);
                return ffcu.a;
            }
        });
        alxr alxrVar = zwtVar.d;
        zwz zwzVar = new zwz(alxrVar.b(), e);
        if (!this.k.snapshot().containsKey(zwzVar)) {
            this.k.put(zwzVar, fgdm.a(dlzfVar));
        }
        if (((fgcm) this.k.get(zwzVar)) != null) {
            fgcmVar = (fgcm) this.k.get(zwzVar);
        } else {
            fgcm a = fgdm.a(dlzfVar);
            this.k.put(zwzVar, a);
            fgcmVar = a;
        }
        axol.k(ffskVar, this.i, new zxa(fgcmVar, this, e, zwtVar, alxrVar, null), 2);
        fgcmVar.getClass();
        return axrg.a(fgcmVar);
    }
}
