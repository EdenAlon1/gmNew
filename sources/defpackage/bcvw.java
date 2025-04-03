package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcvw {
    public static final cskc a = cskc.g("BugleAction", "DraftMessageUtils");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final azaw h;
    public final errl i;
    private final ffbr j;
    private final ffbr k;
    private final ctyw l;

    public bcvw(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ctyw ctywVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, azaw azawVar, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.j = ffbrVar4;
        this.l = ctywVar;
        this.k = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        this.h = azawVar;
        this.i = errlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r3, int r4, java.util.List r5, java.lang.String r6) {
        /*
            r2 = this;
            ffbr r0 = r2.j
            java.lang.Object r0 = r0.b()
            cflw r0 = (defpackage.cflw) r0
            if (r3 == 0) goto Ld
            r0.b(r4, r3)
        Ld:
            cfva r3 = defpackage.cjja.a
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            r1 = 1
            if (r3 == 0) goto L2f
            if (r5 == 0) goto L4b
            j$.util.stream.Stream r3 = j$.util.Collection.EL.stream(r5)
            bcvt r5 = new bcvt
            r5.<init>()
            boolean r3 = r3.noneMatch(r5)
            if (r3 == 0) goto L51
            goto L4b
        L2f:
            if (r5 == 0) goto L4b
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L4b
            int r3 = r5.size()
            if (r3 <= r1) goto L3e
            goto L51
        L3e:
            java.lang.Object r3 = r5.get(r4)
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r3 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r3
            boolean r3 = r3.bA()
            if (r3 != 0) goto L4b
            goto L51
        L4b:
            boolean r3 = r0.c()
            if (r3 == 0) goto L53
        L51:
            r3 = r1
            goto L54
        L53:
            r3 = r4
        L54:
            cskc r5 = defpackage.bcvw.a
            csjb r5 = r5.a()
            java.lang.String r0 = "msg"
            r5.I(r0)
            if (r1 == r3) goto L64
            java.lang.String r0 = "Sms"
            goto L66
        L64:
            java.lang.String r0 = "Mms"
        L66:
            r5.I(r0)
            java.lang.String r0 = "because"
            r5.I(r0)
            r5.I(r6)
            r5.r()
            if (r3 == 0) goto L77
            return r1
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcvw.a(java.lang.String, int, java.util.List, java.lang.String):int");
    }

    public final elfl b(final ConversationIdType conversationIdType, final engw engwVar, final String str, final String str2, final List list, final int i, final boolean z, final boolean z2) {
        return elfo.h(new erog() { // from class: bcvv
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final bcvw bcvwVar = bcvw.this;
                bdeo bdeoVar = (bdeo) bcvwVar.c.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                bcyk a2 = bdeoVar.a(conversationIdType2);
                if (a2 == null) {
                    csix.c("Trying to determine message protocol type for a non-existent conversation");
                    return elfo.e(-1);
                }
                int L = a2.L();
                int d = a2.d();
                if (L == 2) {
                    bcvw.a.m("msg Rcs because in Rcs group.");
                    return elfo.e(3);
                }
                if (z2) {
                    bcvw.a.m("msg Rcs because it's with bot recipient(s).");
                    return elfo.e(3);
                }
                if (z) {
                    bcvw.a.m("msg Mms because told explicitly.");
                    return elfo.e(1);
                }
                if (!TextUtils.isEmpty(str)) {
                    bcvw.a.m("msg Mms because has subject.");
                    return elfo.e(1);
                }
                if (((bczy) bcvwVar.b.b()).ac(conversationIdType2)) {
                    bcvw.a.m("msg Mms because receiver is email.");
                    return elfo.e(1);
                }
                final int i2 = i;
                if (L == 1) {
                    if (((cpbw) bcvwVar.e.b()).d(i2)) {
                        bcvw.a.m("msg Mms because in Mms group.");
                        return elfo.e(1);
                    }
                    bcvw.a.m("msg Sms because group Mms is disabled.");
                    return elfo.e(0);
                }
                final List list2 = list;
                final String str3 = str2;
                if (d == 1) {
                    return elfo.e(Integer.valueOf(bcvwVar.a(str3, i2, list2, "conversation forced to xMS")));
                }
                if (d == 2) {
                    return elfo.e(Integer.valueOf(bcvwVar.a(str3, i2, list2, "conversation latched to xMS")));
                }
                aoku aokuVar = (aoku) engwVar.get(0);
                if (i2 > 0) {
                    ((akzt) bcvwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 4);
                } else if (i2 == 0) {
                    ((akzt) bcvwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 3);
                } else if (i2 == -1) {
                    ((akzt) bcvwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 2);
                } else {
                    ((akzt) bcvwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 1);
                }
                if ((((ckge) ((csjk) bcvwVar.d.b()).a()).f(i2) == eqwf.AVAILABLE) != ((djrv) bcvwVar.f.b()).x(i2)) {
                    ((akzt) bcvwVar.g.b()).e("Bugle.Dsdr.ProvisioningApiDiff", ((djrv) bcvwVar.f.b()).d(i2).a.N);
                }
                return !((djrv) bcvwVar.f.b()).x(i2) ? elfo.e(Integer.valueOf(bcvwVar.a(str3, i2, list2, "Sender not RCS available"))) : bcvwVar.h.c(aokuVar).h(new emwl() { // from class: bcvu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        if (((azau) obj).e()) {
                            bcvw.a.m("msg Rcs: both sender/receiver ready for rcs.");
                            return 3;
                        }
                        List list3 = list2;
                        int i3 = i2;
                        return Integer.valueOf(bcvw.this.a(str3, i3, list3, "Receiver not RCS capable"));
                    }
                }, bcvwVar.i);
            }
        }, this.i);
    }

    public final boolean c(Context context, int i) {
        try {
            if (this.l.a(i).q(context.getString(R.string.stop_asking_sim_number_pref_key), false)) {
                return false;
            }
            return ((ctwb) this.k.b()).h(i).k(true).isEmpty();
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
