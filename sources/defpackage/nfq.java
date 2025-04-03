package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class nfq implements lra {
    public final String a;
    public final String b;

    public nfq(String str, String str2) {
        this.a = emuz.d(str);
        this.b = str2;
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lra
    public final void b(lqy lqyVar) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals(VCardConstants.PROPERTY_TITLE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                lqyVar.a = this.b;
                break;
            case 1:
                lqyVar.b = this.b;
                break;
            case 2:
                lqyVar.c = this.b;
                break;
            case 3:
                lqyVar.d = this.b;
                break;
            case 4:
                Integer h = ermn.h(this.b);
                if (h != null) {
                    lqyVar.h = h;
                    break;
                }
                break;
            case 5:
                Integer h2 = ermn.h(this.b);
                if (h2 != null) {
                    lqyVar.i = h2;
                    break;
                }
                break;
            case 6:
                Integer h3 = ermn.h(this.b);
                if (h3 != null) {
                    lqyVar.u = h3;
                    break;
                }
                break;
            case 7:
                Integer h4 = ermn.h(this.b);
                if (h4 != null) {
                    lqyVar.v = h4;
                    break;
                }
                break;
            case '\b':
                lqyVar.w = this.b;
                break;
            case '\t':
                lqyVar.e = this.b;
                break;
        }
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfq nfqVar = (nfq) obj;
            if (this.a.equals(nfqVar.a) && this.b.equals(nfqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
