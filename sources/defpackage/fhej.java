package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhej extends fgwo {
    public static final fhej c = new fhei();
    private static final long serialVersionUID = 8872508067309087704L;
    private String d;
    private String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhej() {
        super(VCardConstants.PROPERTY_VERSION);
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.d;
        if (str != null) {
            stringBuffer.append(str);
            if (this.e != null) {
                stringBuffer.append(';');
            }
        }
        String str2 = this.e;
        if (str2 != null) {
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        if (str.indexOf(59) < 0) {
            this.e = str;
        } else {
            this.d = str.substring(0, str.indexOf(59) - 1);
            this.e = str.substring(str.indexOf(59));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhej(fgwl fgwlVar) {
        super(VCardConstants.PROPERTY_VERSION, fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.e = "2.0";
    }
}
