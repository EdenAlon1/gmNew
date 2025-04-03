package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nea {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static lrb b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] ah = lvf.ah(str, "=");
            if (ah.length != 2) {
                luj.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (ah[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nfp.d(new luv(Base64.decode(ah[1], 0))));
                } catch (RuntimeException e) {
                    luj.g("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new ngy(ah[0], ah[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new lrb(arrayList);
    }

    public static ndx c(luv luvVar, boolean z, boolean z2) {
        if (z) {
            d(3, luvVar, false);
        }
        luvVar.y((int) luvVar.p());
        long p = luvVar.p();
        String[] strArr = new String[(int) p];
        for (int i = 0; i < p; i++) {
            strArr[i] = luvVar.y((int) luvVar.p());
        }
        if (z2 && (luvVar.j() & 1) == 0) {
            throw new lrg("framing bit expected to be set", null, true, 1);
        }
        return new ndx(strArr);
    }

    public static boolean d(int i, luv luvVar, boolean z) {
        if (luvVar.b() < 7) {
            if (z) {
                return false;
            }
            throw new lrg("too short header: " + luvVar.b(), null, true, 1);
        }
        if (luvVar.j() != i) {
            if (z) {
                return false;
            }
            throw new lrg("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null, true, 1);
        }
        if (luvVar.j() == 118 && luvVar.j() == 111 && luvVar.j() == 114 && luvVar.j() == 98 && luvVar.j() == 105 && luvVar.j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new lrg("expected characters 'vorbis'", null, true, 1);
    }
}
