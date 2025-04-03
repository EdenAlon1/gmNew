package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abje {
    public static final void a(final abjb abjbVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1368200106);
        if (i3 == 0) {
            i2 = (true != b.D(abjbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            String b2 = jii.b(R.string.bottom_sheets_videocalling_invite_heading, new Object[]{abjbVar.a}, b);
            String a = jii.a(R.string.bottom_sheets_videocalling_send_invite, b);
            b.v(1147102525);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: abjc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        abjb abjbVar2 = abjb.this;
                        abjbVar2.c.invoke();
                        abjbVar2.b.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dmff.a(new dmfm(b2, new doas(a, (ffix) R), new doas(jii.a(R.string.bottom_sheets_videocalling_no_thanks, b), abjbVar.b), (String) null, (List) null, new doat(R.drawable.invite_link_prompt_graphic), (dmeb) null, abjbVar.b, 920), hviVar, b, i2 & 112, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abjd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    abjb abjbVar2 = abjb.this;
                    int i5 = i;
                    abje.a(abjbVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
