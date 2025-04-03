package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abji {
    public static final void a(final abjf abjfVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-436969710);
        if (i3 == 0) {
            i2 = (true != b.D(abjfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            String a = jii.a(R.string.bottom_sheets_videocalling_meet_setup_heading, b);
            String a2 = jii.a(R.string.bottom_sheets_videocalling_meet_setup_body, b);
            String a3 = jii.a(R.string.bottom_sheets_videocalling_set_up_meet, b);
            b.v(423595701);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: abjg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        abjf abjfVar2 = abjf.this;
                        abjfVar2.b.invoke();
                        abjfVar2.a.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dmff.a(new dmfm(a, new doas(a3, (ffix) R), new doas(jii.a(R.string.bottom_sheets_videocalling_no_thanks, b), abjfVar.a), a2, (List) null, new doat(R.drawable.setup_meet_prompt_graphic), (dmeb) null, abjfVar.a, 912), hviVar, b, i2 & 112, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abjh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    abjf abjfVar2 = abjf.this;
                    int i5 = i;
                    abji.a(abjfVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
