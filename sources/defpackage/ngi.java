package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngi extends ngd {
    public final String a;
    public final engw b;

    /* JADX WARN: Multi-variable type inference failed */
    public ngi(String str, String str2, List list) {
        super(str);
        lti.a(!list.isEmpty());
        this.a = str2;
        engw n = engw.n(list);
        this.b = n;
    }

    private static List d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ngd, defpackage.lra
    public final void b(lqy lqyVar) {
        char c;
        String str = this.f;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case 1:
                    lqyVar.a = (CharSequence) this.b.get(0);
                    break;
                case 2:
                case 3:
                    lqyVar.b = (CharSequence) this.b.get(0);
                    break;
                case 4:
                case 5:
                    lqyVar.d = (CharSequence) this.b.get(0);
                    break;
                case 6:
                case 7:
                    lqyVar.c = (CharSequence) this.b.get(0);
                    break;
                case '\b':
                case '\t':
                    String[] ag = lvf.ag((String) this.b.get(0), "/");
                    int parseInt = Integer.parseInt(ag[0]);
                    Integer valueOf = ag.length > 1 ? Integer.valueOf(Integer.parseInt(ag[1])) : null;
                    lqyVar.h = Integer.valueOf(parseInt);
                    lqyVar.i = valueOf;
                    break;
                case '\n':
                case 11:
                    lqyVar.l = Integer.valueOf(Integer.parseInt((String) this.b.get(0)));
                    break;
                case '\f':
                case '\r':
                    String str2 = (String) this.b.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    lqyVar.m = Integer.valueOf(parseInt2);
                    lqyVar.n = Integer.valueOf(parseInt3);
                    break;
                case 14:
                    List d = d((String) this.b.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                lqyVar.n = (Integer) d.get(2);
                            }
                        }
                        lqyVar.m = (Integer) d.get(1);
                    }
                    lqyVar.l = (Integer) d.get(0);
                    break;
                case 15:
                    List d2 = d((String) this.b.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                lqyVar.q = (Integer) d2.get(2);
                            }
                        }
                        lqyVar.p = (Integer) d2.get(1);
                    }
                    lqyVar.o = (Integer) d2.get(0);
                    break;
                case 16:
                case 17:
                    lqyVar.s = (CharSequence) this.b.get(0);
                    break;
                case 18:
                case 19:
                    lqyVar.t = (CharSequence) this.b.get(0);
                    break;
                case 20:
                case 21:
                    lqyVar.r = (CharSequence) this.b.get(0);
                    break;
                case 22:
                    Integer h = ermn.h((String) this.b.get(0));
                    if (h != null) {
                        String a = nge.a(h.intValue());
                        if (a != null) {
                            lqyVar.w = a;
                            break;
                        }
                    } else {
                        lqyVar.w = (CharSequence) this.b.get(0);
                        break;
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngi ngiVar = (ngi) obj;
            String str = this.f;
            String str2 = ngiVar.f;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.a, ngiVar.a) && enkr.h(this.b, ngiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() + 527;
        String str = this.a;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": description=" + this.a + ": values=" + String.valueOf(this.b);
    }
}
