package defpackage;

import android.R;
import android.content.Context;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcg implements cvrr {
    public static final cskc a = cskc.g("BugleContacts", "StartChatRcsUiAdapterImpl");
    public static final enru b = enru.c("com/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector");
    public final Context c;
    public final cwis d;
    public final cwbc e;
    public final ajjc f;
    public final cpbs g;
    public final ffbr h;
    public final akzt i;
    public final auee j;
    public final fgcm k;
    public final fgcm l;
    public final fgcm m;
    public final ffxx n;
    private final ffsk o;
    private final ffhd p;

    public cwcg(ffsk ffskVar, Context context, ffhd ffhdVar, cwis cwisVar, cwbc cwbcVar, ajjc ajjcVar, cpbs cpbsVar, ffbr ffbrVar, akzt akztVar, auee aueeVar) {
        ffskVar.getClass();
        context.getClass();
        ffhdVar.getClass();
        cwisVar.getClass();
        cwbcVar.getClass();
        ajjcVar.getClass();
        cpbsVar.getClass();
        ffbrVar.getClass();
        akztVar.getClass();
        aueeVar.getClass();
        this.o = ffskVar;
        this.c = context;
        this.p = ffhdVar;
        this.d = cwisVar;
        this.e = cwbcVar;
        this.f = ajjcVar;
        this.g = cpbsVar;
        this.h = ffbrVar;
        this.i = akztVar;
        this.j = aueeVar;
        this.k = fgdm.a(true);
        this.l = fgdm.a(true);
        this.m = fgdm.a(new cwbv(null, 7));
        this.n = new cwbz(((cwiw) ffbrVar.b()).a(), this);
    }

    @Override // defpackage.cvrr
    public final void a() {
        axol.k(this.o, this.p, new cwcc(this, null), 2);
        axol.k(this.o, this.p, new cwcf(this, null), 2);
    }

    public final dmve b(String str, List list, ffix ffixVar, ffix ffixVar2) {
        String string = this.c.getString(R.string.ok);
        string.getClass();
        doas doasVar = new doas(string, ffixVar);
        String string2 = this.c.getString(R.string.cancel);
        string2.getClass();
        return new dmve(str, list, null, null, false, false, doasVar, new doas(string2, ffixVar2), ffixVar2, 60);
    }

    public final dmve c(final ChipData chipData, int i) {
        String b2 = qmn.b(this.c, com.google.android.apps.messaging.R.string.group_limit_alert_dialog_message, "max_group_size_excluding_self", Integer.valueOf(i));
        String string = this.c.getString(R.string.ok);
        string.getClass();
        return new dmve(b2, null, null, null, false, false, new doas(string, new ffix() { // from class: cwbq
            @Override // defpackage.ffix
            public final Object invoke() {
                cwcg.this.d.c(chipData);
                return ffcu.a;
            }
        }), null, new ffix() { // from class: cwbr
            @Override // defpackage.ffix
            public final Object invoke() {
                cwcg.this.d.c(chipData);
                return ffcu.a;
            }
        }, 190);
    }
}
