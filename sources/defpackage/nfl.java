package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfl extends nfj {
    @Override // defpackage.nfj
    protected final lrb b(nfi nfiVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            luu luuVar = new luu(byteBuffer.array(), byteBuffer.limit());
            luuVar.n(12);
            int b = luuVar.b() + luuVar.d(12);
            luuVar.n(44);
            luuVar.o(luuVar.d(12));
            luuVar.n(16);
            ArrayList arrayList = new ArrayList();
            while (luuVar.b() < b - 4) {
                luuVar.n(48);
                int d = luuVar.d(8);
                luuVar.n(4);
                int b2 = luuVar.b() + luuVar.d(12);
                String str = null;
                String str2 = null;
                while (luuVar.b() < b2) {
                    int d2 = luuVar.d(8);
                    int d3 = luuVar.d(8);
                    int b3 = luuVar.b() + d3;
                    if (d2 == 2) {
                        int d4 = luuVar.d(16);
                        luuVar.n(8);
                        if (d4 == 3) {
                            while (luuVar.b() < b3) {
                                str = luuVar.f(luuVar.d(8), StandardCharsets.US_ASCII);
                                int d5 = luuVar.d(8);
                                for (int i = 0; i < d5; i++) {
                                    luuVar.o(luuVar.d(8));
                                }
                            }
                        }
                    } else if (d2 == 21) {
                        str2 = luuVar.f(d3, StandardCharsets.US_ASCII);
                    }
                    luuVar.l(b3 * 8);
                }
                luuVar.l(b2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new nfk(d, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new lrb(arrayList);
            }
        }
        return null;
    }
}
