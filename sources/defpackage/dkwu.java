package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwu implements dkwc {
    public List a;
    public String b;
    public String c;
    public String d;
    public final dkwo e;

    public dkwu(dkwo dkwoVar, String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.e = dkwoVar;
        if (str3 != null) {
            this.d = str3;
        }
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "service-description");
        if (this.b != null) {
            xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "service-id");
            xmlSerializer.text(this.b);
            xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "service-id");
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        }
        if (this.d != null) {
            xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "description");
            xmlSerializer.text(this.d);
            xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "description");
        }
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.e.b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "service-description");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkwu)) {
            return false;
        }
        dkwu dkwuVar = (dkwu) obj;
        String str = this.b;
        if ((str == null && dkwuVar.b != null) || (str != null && !str.equals(dkwuVar.b))) {
            return false;
        }
        String str2 = this.c;
        return str2 == null ? dkwuVar.c == null : str2.equals(dkwuVar.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.c;
        int i = hashCode * 31;
        return str2 != null ? i + str2.hashCode() : i;
    }

    public final String toString() {
        return "ServiceDescription{serviceID='" + this.b + "', version='" + this.c + "', description='" + this.d + "'}";
    }
}
