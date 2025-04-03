package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjbb {
    private final fazb a;
    private final fazb b;

    public cjbb(fazb fazbVar, fazb fazbVar2) {
        this.a = fazbVar;
        this.b = fazbVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.text.SpannableStringBuilder] */
    final cjay a(Context context, bcse bcseVar, boolean z, String str) {
        String str2;
        String str3;
        boolean z2 = bcseVar.aD() && (bcseVar.f() == 101 || bcseVar.f() == 115);
        if (ctjd.b() && bcseVar.ay() && !bcseVar.Z(new Predicate() { // from class: cjaz
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MessagePartCoreData) obj).bg();
            }
        }).isEmpty()) {
            str2 = context.getText(R.string.im_notification_received_photomoji_reaction);
        } else {
            String string = z2 ? context.getResources().getString(R.string.im_notification_title_manual_download) : bcseVar.V(context);
            String c = ((cpdg) this.a.b()).c(context.getResources(), bcseVar.H());
            if (!TextUtils.isEmpty(c)) {
                String string2 = context.getString(R.string.subject_label);
                ?? spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(context.getString(R.string.im_notification_subject, string2, c));
                if (!TextUtils.isEmpty(string)) {
                    spannableStringBuilder.append(System.lineSeparator()).append((CharSequence) string);
                }
                string = spannableStringBuilder;
            }
            if (bcseVar.bb()) {
                String string3 = context.getString(R.string.im_notification_urgent_message);
                ?? spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(string3);
                if (!TextUtils.isEmpty(string)) {
                    spannableStringBuilder2.append(" ").append((CharSequence) string);
                }
                str2 = spannableStringBuilder2;
            } else {
                str2 = string;
            }
        }
        String P = bcseVar.P(true);
        String str4 = (z || P != null) ? P : str;
        Uri uri = null;
        MessagePartCoreData messagePartCoreData = null;
        MessagePartCoreData messagePartCoreData2 = null;
        MessagePartCoreData messagePartCoreData3 = null;
        MessagePartCoreData messagePartCoreData4 = null;
        for (MessagePartCoreData messagePartCoreData5 : bcseVar.Y()) {
            if (!messagePartCoreData5.bx()) {
                if (messagePartCoreData5.bo() && messagePartCoreData == null) {
                    messagePartCoreData = messagePartCoreData5;
                }
                if (messagePartCoreData5.bD() && messagePartCoreData2 == null) {
                    messagePartCoreData2 = messagePartCoreData5;
                }
                if (messagePartCoreData5.bC() && messagePartCoreData4 == null) {
                    messagePartCoreData4 = messagePartCoreData5;
                }
                if (messagePartCoreData5.ba() && messagePartCoreData3 == null) {
                    messagePartCoreData3 = messagePartCoreData5;
                }
            }
        }
        if (messagePartCoreData == null || (cubs.f() && ((cutu) this.b.b()).b() && messagePartCoreData.H() != byyz.NEGATIVE_VERDICT_DISPLAY_IMAGE)) {
            messagePartCoreData = messagePartCoreData2 != null ? messagePartCoreData2 : messagePartCoreData3 != null ? messagePartCoreData3 : messagePartCoreData4 != null ? messagePartCoreData4 : null;
        }
        if (messagePartCoreData != null) {
            uri = messagePartCoreData.t();
            str3 = messagePartCoreData.V();
            if (uri == null && messagePartCoreData.x() != null) {
                uri = messagePartCoreData.x();
            }
        } else {
            str3 = null;
        }
        cixy cixyVar = new cixy(uri, str3);
        return new cixx(str4, str2, cixyVar.a, cixyVar.b, bcseVar.aD(), z2, bcseVar.au(), bcseVar.u());
    }
}
