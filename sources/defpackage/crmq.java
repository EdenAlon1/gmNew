package defpackage;

import android.net.Uri;
import java.math.BigInteger;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crmq {
    public final errl d;
    private final crnc f;
    private static final cfva e = cfvl.q(178320754);
    public static final Pattern a = Pattern.compile("\\/maps\\/place\\/(.*?)\\/");
    public static final Pattern b = Pattern.compile("\\/maps\\/place\\/@\\/data=!4m2!3m1!1s(.*)");
    public static final BigInteger c = BigInteger.valueOf(2).pow(64).add(BigInteger.valueOf(-1));

    public crmq(errl errlVar, crnc crncVar) {
        this.f = crncVar;
        this.d = errlVar;
    }

    public static String b(Uri uri, String str) {
        return !((Boolean) e.e()).booleanValue() ? uri.getQueryParameter(str) : uri.isHierarchical() ? uri.getQueryParameter(str) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(String str, fbrw fbrwVar) {
        List i = emye.b(':').f().i(str);
        if (i.size() == 2 && ((String) i.get(0)).startsWith("0x") && ((String) i.get(1)).startsWith("0x")) {
            try {
                BigInteger bigInteger = new BigInteger(((String) i.get(0)).substring(2), 16);
                if (bigInteger.signum() >= 0) {
                    BigInteger bigInteger2 = c;
                    if (bigInteger.compareTo(bigInteger2) <= 0) {
                        BigInteger bigInteger3 = new BigInteger(((String) i.get(1)).substring(2), 16);
                        if (bigInteger3.signum() >= 0 && bigInteger3.compareTo(bigInteger2) <= 0) {
                            fbvk fbvkVar = (fbvk) fbvl.a.createBuilder();
                            ezol ezolVar = (ezol) ezom.a.createBuilder();
                            evjt evjtVar = (evjt) evju.a.createBuilder();
                            long longValue = bigInteger.longValue();
                            evjtVar.copyOnWrite();
                            evju evjuVar = (evju) evjtVar.instance;
                            evjuVar.b |= 1;
                            evjuVar.c = longValue;
                            long longValue2 = bigInteger3.longValue();
                            evjtVar.copyOnWrite();
                            evju evjuVar2 = (evju) evjtVar.instance;
                            evjuVar2.b = 2 | evjuVar2.b;
                            evjuVar2.d = longValue2;
                            ezolVar.copyOnWrite();
                            ezom ezomVar = (ezom) ezolVar.instance;
                            evju evjuVar3 = (evju) evjtVar.build();
                            evjuVar3.getClass();
                            ezomVar.c = evjuVar3;
                            ezomVar.b |= 1;
                            String a2 = exgt.a((ezom) ezolVar.build());
                            fbvkVar.copyOnWrite();
                            ((fbvl) fbvkVar.instance).e = a2;
                            fbrwVar.copyOnWrite();
                            fbrx fbrxVar = (fbrx) fbrwVar.instance;
                            fbvl fbvlVar = (fbvl) fbvkVar.build();
                            fbrx fbrxVar2 = fbrx.a;
                            fbvlVar.getClass();
                            fbrxVar.e = fbvlVar;
                            fbrxVar.b |= 4;
                            return true;
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final elfl a(final String str, final fbrw fbrwVar) {
        List i = emye.b(',').f().i(str);
        if (i.size() == 2) {
            try {
                double parseDouble = Double.parseDouble((String) i.get(0));
                double parseDouble2 = Double.parseDouble((String) i.get(1));
                fbvk fbvkVar = (fbvk) fbvl.a.createBuilder();
                faut fautVar = (faut) fauu.a.createBuilder();
                fautVar.copyOnWrite();
                ((fauu) fautVar.instance).b = parseDouble;
                fautVar.copyOnWrite();
                ((fauu) fautVar.instance).c = parseDouble2;
                fbvkVar.copyOnWrite();
                fbvl fbvlVar = (fbvl) fbvkVar.instance;
                fauu fauuVar = (fauu) fautVar.build();
                fauuVar.getClass();
                fbvlVar.d = fauuVar;
                fbvlVar.b |= 1;
                fbrwVar.copyOnWrite();
                fbrx fbrxVar = (fbrx) fbrwVar.instance;
                fbvl fbvlVar2 = (fbvl) fbvkVar.build();
                fbrx fbrxVar2 = fbrx.a;
                fbvlVar2.getClass();
                fbrxVar.e = fbvlVar2;
                fbrxVar.b |= 4;
                return elfo.e(true);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f.b(str).h(new emwl() { // from class: crmp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fbuk fbukVar = (fbuk) obj;
                Pattern pattern = crmq.a;
                if (fbukVar == null) {
                    return false;
                }
                fbvn fbvnVar = (fbukVar.c == 7 ? (fbrx) fbukVar.d : fbrx.a).c;
                if (fbvnVar == null) {
                    fbvnVar = fbvn.a;
                }
                String str2 = str;
                fbrw fbrwVar2 = fbrw.this;
                fbrwVar2.copyOnWrite();
                fbrx fbrxVar3 = (fbrx) fbrwVar2.instance;
                fbvnVar.getClass();
                fbrxVar3.c = fbvnVar;
                fbrxVar3.b |= 1;
                fbvk fbvkVar2 = (fbvk) fbvl.a.createBuilder();
                fbvkVar2.copyOnWrite();
                fbvl fbvlVar3 = (fbvl) fbvkVar2.instance;
                str2.getClass();
                fbvlVar3.c = str2;
                fbrwVar2.copyOnWrite();
                fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                fbvl fbvlVar4 = (fbvl) fbvkVar2.build();
                fbvlVar4.getClass();
                fbrxVar4.e = fbvlVar4;
                fbrxVar4.b |= 4;
                return true;
            }
        }, this.d);
    }
}
