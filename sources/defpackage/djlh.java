package defpackage;

import android.telephony.ims.SipMessage;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djlh {
    public static SipMessage a(eelv eelvVar) {
        String str;
        if (eelvVar.s()) {
            eelw eelwVar = (eelw) eelvVar;
            str = eelwVar.i() + " " + eelwVar.w() + " SIP/2.0\r\n";
        } else {
            eelx eelxVar = (eelx) eelvVar;
            str = "SIP/2.0 " + eelxVar.w() + " " + eelxVar.x() + VCardBuilder.VCARD_END_OF_LINE;
        }
        StringBuilder sb = new StringBuilder();
        for (eeku eekuVar : eelvVar.d) {
            if (!(eekuVar instanceof eekn)) {
                sb.append(eekuVar);
            }
        }
        byte[] bArr = eelvVar.k;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append("Content-Length: ");
        sb.append(bArr.length);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return new SipMessage(str, sb.toString(), bArr);
    }
}
