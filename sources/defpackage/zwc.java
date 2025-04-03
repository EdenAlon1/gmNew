package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwc {
    private final Context a;
    private final csrh b;
    private final crnx c;
    private final askx d;
    private final ffbr e;

    public zwc(Context context, csrh csrhVar, crnx crnxVar, askx askxVar, ffbr ffbrVar) {
        context.getClass();
        csrhVar.getClass();
        crnxVar.getClass();
        askxVar.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.b = csrhVar;
        this.c = crnxVar;
        this.d = askxVar;
        this.e = ffbrVar;
    }

    private static final String c(alxr alxrVar) {
        alya d = alxrVar.d();
        if (!(d instanceof alxp)) {
            return null;
        }
        ResolvedRecipient a = ((alxp) d).a();
        if (a.y() == null) {
            return a.x(true);
        }
        aokr G = a.g().G();
        String y = a.y();
        y.getClass();
        return G + " " + cjze.a(y);
    }

    private static final boolean d(alxr alxrVar) {
        return alxrVar.d().d() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(defpackage.alxr r7) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwc.a(alxr):java.lang.String");
    }

    public final String b(alxr alxrVar) {
        alxrVar.getClass();
        String str = "";
        if (alxrVar instanceof alyv) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (((Boolean) this.e.b()).booleanValue() && zsr.p(alxrVar)) {
            String string = this.a.getResources().getString(R.string.message_edited_talkback_announcement);
            string.getClass();
            sb.append(string.concat(" "));
        }
        if (d(alxrVar) && (alxrVar.d() instanceof alyn)) {
            alya d = alxrVar.d();
            d.getClass();
            alxo a = ((alyn) d).a();
            boolean z = alxrVar.g() instanceof appw;
            if (a == alxo.DELIVERED) {
                str = this.a.getResources().getString(R.string.message_status_conv2_delivered);
            } else {
                alxo alxoVar = alxo.SEEN;
                if (a == alxoVar && z) {
                    str = this.a.getResources().getString(R.string.message_status_conv2_read);
                } else if (a == alxoVar && !z) {
                    str = this.a.getResources().getString(R.string.message_status_conv2_seen);
                }
            }
            str.getClass();
            if (str.length() > 0) {
                sb.append(", ".concat(str));
            }
        }
        if (this.d.a()) {
            String string2 = alxrVar.v() ? this.a.getResources().getString(R.string.message_status_conv2_encrypted) : this.a.getResources().getString(R.string.message_status_conv2_unencrypted);
            string2.getClass();
            sb.append(", ".concat(string2));
        } else if (alxrVar.v()) {
            String string3 = this.a.getResources().getString(R.string.metadata_encryption_status_conv2);
            string3.getClass();
            sb.append(", ".concat(string3));
        }
        return sb.toString();
    }
}
