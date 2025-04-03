package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvoj implements cvny {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final eisx e;
    public final ffbr f;
    public boolean g;
    private final ffbr h;
    private final ffbr i;
    private final ffsk j;
    private final ffhd k;

    public cvoj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, eisx eisxVar, ffbr ffbrVar7, ffsk ffskVar, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        eisxVar.getClass();
        ffbrVar7.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.a = ffbrVar;
        this.h = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.i = ffbrVar6;
        this.e = eisxVar;
        this.f = ffbrVar7;
        this.j = ffskVar;
        this.k = ffhdVar;
        axol.k(ffskVar, ffhdVar, new cvoh(this, null), 2);
    }

    @Override // defpackage.cvny
    public final void a(final cvoa cvoaVar) {
        if (!this.g || !cvoaVar.d || cvoaVar.f || cvoaVar.e || cvoaVar.h) {
            cvoaVar.a.invoke();
            return;
        }
        if (((Boolean) ((cfup) cubs.q.get()).e()).booleanValue()) {
            cuks cuksVar = (cuks) this.h.b();
            MessageId messageId = cvoaVar.b;
            String str = cvoaVar.c;
            if (!(messageId instanceof apah)) {
                throw new IllegalArgumentException("MAPI MessageID is not yet natively supported in spam.");
            }
            MessageIdType c = ((apah) messageId).c();
            c.getClass();
            cuksVar.a(c, str);
        }
        if (((Boolean) ((cfup) cubs.r.get()).e()).booleanValue()) {
            ((ajjc) this.i.b()).d(true, new ffji() { // from class: cvob
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    final ajiy ajiyVar = (ajiy) obj;
                    ajiyVar.getClass();
                    final cvoj cvojVar = cvoj.this;
                    final cvoa cvoaVar2 = cvoaVar;
                    if (cvoaVar2.i) {
                        cvojVar.b(3);
                    } else {
                        if (!cvoaVar2.g) {
                            cvojVar.b(1);
                            final fflb fflbVar = new fflb();
                            String string = ((Context) cvojVar.a.b()).getString(R.string.safety_check_dialog_title);
                            string.getClass();
                            fflbVar.a = new dmvi(string, ffel.a, ((Context) cvojVar.a.b()).getString(R.string.safety_check_dialog_message), null, null, null, null, 120);
                            final fflb fflbVar2 = new fflb();
                            String string2 = ((Context) cvojVar.a.b()).getString(R.string.safety_check_dialog_checkbox_title);
                            string2.getClass();
                            String string3 = ((Context) cvojVar.a.b()).getString(R.string.safety_check_dialog_checkbox_message);
                            int i = huo.a;
                            fflbVar2.a = new dnem(string2, string3, null, false, false, null, hum.m, Alert.DURATION_SHOW_INDEFINITELY, 52);
                            fflbVar2.a = dnem.a((dnem) fflbVar2.a, null, null, null, false, new ffix() { // from class: cvod
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    fflb fflbVar3 = fflb.this;
                                    fflbVar3.a = dnem.a((dnem) fflbVar3.a, null, null, null, !r2.d, null, null, 247);
                                    fflb fflbVar4 = fflbVar;
                                    dmvi dmviVar = (dmvi) fflbVar4.a;
                                    final cvoj cvojVar2 = cvojVar;
                                    String string4 = ((Context) cvojVar2.a.b()).getString(R.string.safety_check_dialog_positive);
                                    string4.getClass();
                                    boolean z = ((dnem) fflbVar3.a).d;
                                    final ajiy ajiyVar2 = ajiyVar;
                                    final cvoa cvoaVar3 = cvoaVar2;
                                    fflbVar4.a = dmvi.b(dmviVar, null, ffdx.b(fflbVar3.a), null, null, new doas(string4, z, new ffix() { // from class: cvoc
                                        @Override // defpackage.ffix
                                        public final Object invoke() {
                                            cvoj.this.b(4);
                                            ajiyVar2.a();
                                            cvoaVar3.a.invoke();
                                            return ffcu.a;
                                        }
                                    }), null, 93);
                                    ajiyVar2.b((doau) fflbVar4.a);
                                    return ffcu.a;
                                }
                            }, null, 215);
                            dmvi dmviVar = (dmvi) fflbVar.a;
                            String string4 = ((Context) cvojVar.a.b()).getString(android.R.string.cancel);
                            string4.getClass();
                            doas doasVar = new doas(string4, new ffix() { // from class: cvoe
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ajiy.this.a();
                                    return ffcu.a;
                                }
                            });
                            String string5 = ((Context) cvojVar.a.b()).getString(R.string.safety_check_dialog_positive);
                            string5.getClass();
                            fflbVar.a = dmvi.b(dmviVar, null, ffdx.b(fflbVar2.a), null, doasVar, new doas(string5, false, new ffix() { // from class: cvof
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    return ffcu.a;
                                }
                            }), null, 77);
                            return (dmvt) fflbVar.a;
                        }
                        cvojVar.b(2);
                    }
                    ffbr ffbrVar = cvojVar.a;
                    dmzz dmzzVar = dmzz.dc;
                    String string6 = ((Context) ffbrVar.b()).getString(R.string.safe_url_dialog_spam_folder_title);
                    String string7 = ((Context) cvojVar.a.b()).getString(R.string.safe_url_dialog_spam_folder_message);
                    string7.getClass();
                    String string8 = ((Context) cvojVar.a.b()).getString(android.R.string.cancel);
                    string8.getClass();
                    return new dmve(string7, null, dmzzVar, string6, false, true, new doas(string8, new ffix() { // from class: cvog
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return ffcu.a;
                        }
                    }), null, null, 402);
                }
            });
        } else {
            cvoaVar.a.invoke();
        }
    }

    public final void b(int i) {
        axol.k(this.j, this.k, new cvoi(this, i, null), 2);
    }
}
