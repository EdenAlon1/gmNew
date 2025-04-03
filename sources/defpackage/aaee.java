package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaee implements abqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter");
    private final aufk A;
    private final ffbr B;
    private final asnh C;
    private final wys D;
    private final aufp E;
    private final athi F;
    private final askd G;
    private final aufo H;
    private final athc I;
    private final cstx J;
    private final aabt K;
    private final xto L;
    private final xgp M;
    public final Context b;
    public final ffsk c;
    public final ffhd d;
    public final Conversation e;
    public final alye f;
    public final ffbr g;
    public final aigz h;
    public final aufr i;
    public final ffbr j;
    public final zel k;
    public final zen l;
    public final zem m;
    public final ajjc n;
    public final Optional o;
    public final atus p;
    public final ffbz q;
    public final Set r;
    public final ConcurrentHashMap s;
    public final ffji t;
    public final ffjo u;
    public final ffji v;
    public final ffji w;
    public final ailp x;
    private final aans y;
    private final aufn z;

    public aaee(Context context, final ffsk ffskVar, ffhd ffhdVar, Conversation conversation, alye alyeVar, ffbr ffbrVar, aigz aigzVar, xto xtoVar, ailp ailpVar, aufr aufrVar, ffbr ffbrVar2, aans aansVar, zel zelVar, final ffbr ffbrVar3, aufn aufnVar, aufk aufkVar, ffbr ffbrVar4, zen zenVar, asnh asnhVar, wys wysVar, zem zemVar, ajjc ajjcVar, Optional optional, aufp aufpVar, athi athiVar, askd askdVar, xgp xgpVar, aufo aufoVar, athc athcVar, atus atusVar, cstx cstxVar, aabt aabtVar) {
        ffji a2;
        ffji a3;
        ffji a4;
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        conversation.getClass();
        alyeVar.getClass();
        ffbrVar.getClass();
        aigzVar.getClass();
        xtoVar.getClass();
        aufrVar.getClass();
        zelVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        wysVar.getClass();
        zemVar.getClass();
        ajjcVar.getClass();
        askdVar.getClass();
        cstxVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = ffhdVar;
        this.e = conversation;
        this.f = alyeVar;
        this.g = ffbrVar;
        this.h = aigzVar;
        this.L = xtoVar;
        this.x = ailpVar;
        this.i = aufrVar;
        this.j = ffbrVar2;
        this.y = aansVar;
        this.k = zelVar;
        this.z = aufnVar;
        this.A = aufkVar;
        this.B = ffbrVar4;
        this.l = zenVar;
        this.C = asnhVar;
        this.D = wysVar;
        this.m = zemVar;
        this.n = ajjcVar;
        this.o = optional;
        this.E = aufpVar;
        this.F = athiVar;
        this.G = askdVar;
        this.M = xgpVar;
        this.H = aufoVar;
        this.I = athcVar;
        this.p = atusVar;
        this.J = cstxVar;
        this.K = aabtVar;
        this.q = ffca.a(new ffix() { // from class: aadg
            @Override // defpackage.ffix
            public final Object invoke() {
                return (akld) ffbr.this.b();
            }
        });
        this.r = new LinkedHashSet();
        this.s = new ConcurrentHashMap();
        axol.k(ffskVar, null, new aadm(this, null), 3);
        a2 = axqa.a(new aaec(wysVar), 1000L, ffskVar);
        this.t = a2;
        final aado aadoVar = new aado(this);
        final fflb fflbVar = new fflb();
        this.u = new ffjo() { // from class: axpp
            @Override // defpackage.ffjo
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                fflb fflbVar2 = fflb.this;
                if (fflbVar2.a == null) {
                    fflbVar2.a = axol.k(ffskVar, null, new axpy(aadoVar, obj, obj2, obj3, obj4, fflbVar2, null), 3);
                }
                return ffcu.a;
            }
        };
        a3 = axqa.a(new aaea(this), 1000L, ffskVar);
        this.v = a3;
        a4 = axqa.a(new aady(this), 1000L, ffskVar);
        this.w = a4;
    }

    public final dnbm a(dnbw dnbwVar, final aacn aacnVar) {
        int n;
        int i;
        if (cubs.f() && !this.o.isEmpty() && aacnVar.e) {
            apqd apqdVar = aacnVar.f;
            if ((apqdVar instanceof appq) && (n = ((appq) apqdVar).n()) != 0 && n - 1 != 0) {
                return i != 1 ? i != 2 ? i != 3 ? new dnbx(dnbwVar, true, null, null, null, 28) : new dnbx(dnbwVar, false, null, this.b.getString(R.string.spatula_warning), new ffix() { // from class: aacr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final aaee aaeeVar = aaee.this;
                        final aacn aacnVar2 = aacnVar;
                        aaeeVar.n.e(new ffji() { // from class: aacz
                            /* JADX WARN: Type inference failed for: r1v1, types: [abke, java.lang.Object] */
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                final ajiy ajiyVar = (ajiy) obj;
                                ajiyVar.getClass();
                                final aaee aaeeVar2 = aaee.this;
                                ?? r1 = aaeeVar2.o.get();
                                ffix ffixVar = new ffix() { // from class: aadh
                                    @Override // defpackage.ffix
                                    public final Object invoke() {
                                        ajiy.this.a();
                                        return ffcu.a;
                                    }
                                };
                                final aacn aacnVar3 = aacnVar2;
                                return r1.b(new abkd(ffixVar, new ffix() { // from class: aadi
                                    @Override // defpackage.ffix
                                    public final Object invoke() {
                                        aaee aaeeVar3 = aaee.this;
                                        axol.k(aaeeVar3.c, null, new aadw(aaeeVar3, aacnVar3, null), 3);
                                        ajiyVar.a();
                                        return ffcu.a;
                                    }
                                }, aacnVar3.d));
                            }
                        });
                        return ffcu.a;
                    }
                }, 6) : new dnbx(dnbwVar, false, null, this.b.getString(R.string.spatula_warning), new ffix() { // from class: aacq
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aaee aaeeVar = aaee.this;
                        axol.k(aaeeVar.c, null, new aadv(aaeeVar, aacnVar, null), 3);
                        return ffcu.a;
                    }
                }, 6) : new dnbx(dnbwVar, false, new ffix() { // from class: aacp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aaee aaeeVar = aaee.this;
                        axol.k(aaeeVar.c, null, new aadu(aaeeVar, aacnVar, null), 3);
                        return ffcu.a;
                    }
                }, null, null, 26);
            }
        }
        return dnbwVar;
    }

    public final void b(ainw ainwVar) {
        drlx a2 = drlo.a(ainwVar.a);
        if (a2 == null) {
            return;
        }
        xto xtoVar = this.L;
        xgp xgpVar = this.M;
        xtoVar.a(new xhl(xgpVar.a(), a2, ainwVar.b, null, doxq.a));
        ensk h = a.h();
        h.Y(ente.a, "BugleImage");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "processMediaViewerResult", 631, "ImageBubbleUiAdapter.kt")).D("Draft attachment added with uri: %s media type: %s", ainwVar.b, ainwVar.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0027, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ee, code lost:
    
        if (r0.f().getWidth() < (true != ((defpackage.ersq) ((defpackage.auex) r54.H).a.b()).a("bugle.shrink_emoji_kitchen_display_size") ? 300 : 600)) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0536  */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.axrc c(final defpackage.aacn r55) {
        /*
            Method dump skipped, instructions count: 1723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaee.c(aacn):axrc");
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        this.s.clear();
    }
}
