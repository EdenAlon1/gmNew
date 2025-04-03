package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deao implements bcqn {
    private static final cskc a = cskc.g("Bugle", "MessageStatusHelper");
    private final ctvb b;
    private final cuxh c;
    private final bdtd d;
    private final csjk e;
    private final cuye f;
    private final bzqa g;
    private final ffbr h;
    private final ffbr i;
    private final azbq j;

    public deao(ctvb ctvbVar, cuxh cuxhVar, bdtd bdtdVar, csjk csjkVar, cuye cuyeVar, bzqa bzqaVar, ffbr ffbrVar, ffbr ffbrVar2, azbq azbqVar) {
        this.b = ctvbVar;
        this.c = cuxhVar;
        this.d = bdtdVar;
        this.e = csjkVar;
        this.f = cuyeVar;
        this.g = bzqaVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = azbqVar;
    }

    private static String h(bcse bcseVar, Resources resources) {
        boolean aM = bcseVar.aM();
        bgmp bgmpVar = bcseVar.b;
        return (bgmpVar == null ? !(bcseVar.a.f() == 0 && bcseVar.aM() && bcseVar.a.k()) : !(bgmpVar.f() == 0 && aM && bcseVar.b.k())) ? resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs_and_no_fallback) : resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs);
    }

    private final String i(bcse bcseVar, Resources resources) {
        return d(bcseVar.c(), bcseVar.s()) ? bcseVar.an() ? resources.getString(R.string.waiting_to_connect_tap_for_options) : resources.getString(R.string.message_status_waiting_for_connection) : bcseVar.ak() ? resources.getString(R.string.message_status_rcs_stuck_in_sending_hint) : resources.getString(R.string.message_status_sending);
    }

    @Override // defpackage.bcqn
    public final String a(Context context, bcse bcseVar, bctw bctwVar, int i, TextPaint textPaint) {
        Resources resources = context.getResources();
        int f = bcseVar.f();
        if (f != 1) {
            if (f == 2) {
                return resources.getString(R.string.message_status_delivered);
            }
            if (f == 11) {
                int size = bcseVar.h.size();
                if (size != 0 && bctwVar != null) {
                    int i2 = bctwVar.e;
                    if (i2 == 1) {
                        if (size != 1) {
                            i2 = 1;
                        }
                    }
                    if (i2 == bcseVar.ac().size()) {
                        return resources.getString(true != bcseVar.ar() ? R.string.message_status_media_seen_by_all : R.string.message_status_seen_by_all);
                    }
                    List ac = bcseVar.ac();
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= ac.size()) {
                            break;
                        }
                        bcsd bcsdVar = (bcsd) ac.get(i3);
                        ParticipantsTable.BindData b = bctwVar.b(bcsdVar.a);
                        if (b == null) {
                            csjb e = a.e();
                            e.I("Read message not loaded.");
                            e.f(bcsdVar.a);
                            e.d(bcseVar.u());
                            e.r();
                            break;
                        }
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(((bdrt) this.i.b()).a(b, false));
                        i3++;
                    }
                    String quantityString = resources.getQuantityString(true != bcseVar.ar() ? R.plurals.message_status_media_seen_by_list : R.plurals.message_status_seen_by_list, ac.size(), sb.toString());
                    if (textPaint == null) {
                        return quantityString;
                    }
                    cuxh cuxhVar = this.c;
                    resources.getString(R.string.plus_n);
                    return cuxhVar.e(quantityString, textPaint, i, R.plurals.plus_n_plural);
                }
                return resources.getString(true != bcseVar.ar() ? R.string.message_status_seen_media : R.string.message_status_seen_121);
            }
            if (f != 15) {
                if (f != 101) {
                    if (f == 103) {
                        return resources.getString(R.string.message_status_downloading);
                    }
                    if (f != 115) {
                        byzi A = bcseVar.A();
                        if (!A.a() || !this.f.c()) {
                            return null;
                        }
                        boolean booleanValue = ((Boolean) cuye.b.e()).booleanValue();
                        int ordinal = A.ordinal();
                        if (ordinal == 1) {
                            return bcseVar.W();
                        }
                        if (ordinal == 2) {
                            return resources.getString(true != booleanValue ? R.string.vsms_message_status_text_unverified : R.string.vsms_message_status_new_text_unverified);
                        }
                        if (ordinal != 3) {
                            return null;
                        }
                        if (((csmz) this.e.a()).r()) {
                            return resources.getString(true != booleanValue ? R.string.vsms_message_status_text_verification_in_progress : R.string.vsms_message_status_new_text_verification_in_progress);
                        }
                        return resources.getString(true != booleanValue ? R.string.vsms_message_status_text_waiting_for_connection : R.string.vsms_message_status_new_text_waiting_for_connection);
                    }
                }
                if (bcseVar.g() <= 0 || bcseVar.m() <= 0) {
                    return resources.getString(R.string.message_status_download);
                }
                return resources.getString(R.string.message_status_download_with_expiration_and_size, Formatter.formatShortFileSize(context, bcseVar.m()), new SimpleDateFormat("MMM d", ctid.c(context)).format(new Date(bcseVar.g())));
            }
        }
        if (g(bcseVar)) {
            return bcseVar.aX() ? resources.getString(R.string.message_status_sms_auto_fallback_sent) : resources.getString(R.string.message_status_mms_auto_fallback_sent);
        }
        if (bcseVar.aX()) {
            return (bctwVar == null || bctwVar.e <= 1) ? resources.getString(R.string.sms_text) : resources.getString(R.string.broadcast_sms_text);
        }
        if (bcseVar.aC()) {
            return resources.getString(R.string.mms_text);
        }
        if (bcseVar.aM()) {
            ParticipantsTable.BindData a2 = bctwVar != null ? bctwVar.a() : null;
            return (a2 == null || !e(bcseVar, a2)) ? f(bcseVar) ? resources.getString(R.string.message_status_rcs_not_delivered_recipient_may_be_offline) : bcseVar.aj() ? resources.getString(R.string.message_status_rcs_not_delivered_hint) : resources.getString(R.string.message_status_sent) : h(bcseVar, resources);
        }
        csjb b2 = a.b();
        b2.I("MessageStatusHelper#getOutgoingCompleteOrRevocationPendingString on impossible message type:");
        b2.G(bcseVar.c());
        b2.r();
        return "";
    }

    public final String b(Resources resources, bcse bcseVar, bctw bctwVar, int i, int i2) {
        String str;
        if (!this.g.i() || !byyr.d(bcseVar.b()) || bctwVar == null) {
            return resources.getString(R.string.message_status_recipient_failed_decryption);
        }
        List aa = bcseVar.aa();
        int size = aa.size();
        Iterator it = aa.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            ParticipantsTable.BindData b = bctwVar.b(((bcsd) it.next()).a);
            if (b != null && !TextUtils.isEmpty(b.Q())) {
                str = b.Q();
                break;
            }
        }
        if (str.isEmpty()) {
            return resources.getQuantityString(i, size, Integer.valueOf(size));
        }
        if (size <= 1) {
            return resources.getString(i2, str);
        }
        int i3 = size - 1;
        return resources.getString(i2, resources.getQuantityString(R.plurals.name_and_other_plural, i3, str, Integer.valueOf(i3)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(android.content.Context r7, defpackage.bcse r8, defpackage.bctw r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deao.c(android.content.Context, bcse, bctw, boolean):java.lang.String");
    }

    public final boolean d(int i, SelfIdentityId selfIdentityId) {
        aztg d;
        return ((csmz) this.e.a()).x() && (d = this.d.d(selfIdentityId)) != null && ((csmz) this.e.a()).d(i, d.e()) == csod.UNAVAILABLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (((defpackage.avlk) r5.get()).h() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.bcse r5, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r6) {
        /*
            r4 = this;
            int r0 = r5.b()
            boolean r0 = defpackage.byyr.b(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r5.aM()
            if (r0 != 0) goto L13
            return r1
        L13:
            int r0 = r6.o()
            r2 = 1
            if (r0 != r2) goto L1b
            return r1
        L1b:
            cfup r0 = defpackage.clei.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            int r0 = r5.f()
            r3 = 17
            if (r0 != r3) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r1
        L34:
            int r5 = r5.f()
            boolean r5 = defpackage.bdjs.t(r5)
            if (r5 != 0) goto L3f
            goto L7f
        L3f:
            azbq r5 = r4.j
            ffbr r3 = r4.h
            java.lang.Object r3 = r3.b()
            aolr r3 = (defpackage.aolr) r3
            aoku r6 = r3.q(r6)
            j$.util.Optional r6 = r6.e()
            azbn r3 = new azbn
            r3.<init>()
            j$.util.Optional r5 = r6.map(r3)
            azbo r6 = new azbo
            r6.<init>()
            j$.util.Optional r5 = r5.filter(r6)
            azbp r6 = new azbp
            r6.<init>()
            j$.util.Optional r5 = r5.map(r6)
            boolean r6 = r5.isPresent()
            if (r6 == 0) goto L7f
            java.lang.Object r5 = r5.get()
            avlk r5 = (defpackage.avlk) r5
            boolean r5 = r5.h()
            if (r5 != 0) goto L7f
            goto L81
        L7f:
            if (r0 == 0) goto L82
        L81:
            return r2
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deao.e(bcse, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData):boolean");
    }

    public final boolean f(bcse bcseVar) {
        Optional optional;
        bgmp bgmpVar = bcseVar.b;
        if (bgmpVar != null) {
            bgmpVar.az(148, "recipient_offline_timestamp_ms");
            optional = bgmpVar.bZ;
        } else {
            bigm bigmVar = bcseVar.a;
            bigmVar.az(146, "recipient_offline_timestamp_ms");
            optional = bigmVar.bW;
        }
        return bcseVar.aM() && bdjs.t(bcseVar.f()) && optional.isPresent() && Instant.ofEpochMilli(bcseVar.k()).isAfter((Instant) optional.get());
    }

    public final boolean g(bcse bcseVar) {
        return !bcseVar.aM() && bdjs.t(bcseVar.f()) && byyw.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE.equals(bcseVar.c.J());
    }
}
