package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgg {
    public static final void a(final abge abgeVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        String a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-463316012);
        if (i3 == 0) {
            i2 = (true != b.D(abgeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            String b2 = jii.b(R.string.compose_confirmation_title, new Object[]{abgeVar.c}, b);
            String a2 = jii.a(R.string.compose_confirmation_body, b);
            abgh abghVar = abgeVar.d;
            b.v(69770696);
            int ordinal = abghVar.ordinal();
            if (ordinal == 0) {
                b.v(-1346821945);
                a = jii.a(R.string.compose_confirmation_continue_with_text_button, b);
                ((hfm) b).Z();
            } else if (ordinal == 1) {
                b.v(-1346818840);
                a = jii.a(R.string.compose_confirmation_continue_with_audio_button, b);
                ((hfm) b).Z();
            } else {
                if (ordinal != 2) {
                    b.v(-1346823140);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-1346815704);
                a = jii.a(R.string.compose_confirmation_continue_with_video_button, b);
                ((hfm) b).Z();
            }
            ((hfm) b).Z();
            dmff.a(new dmfm(b2, new doas(a, abgeVar.b), new doas(jii.a(R.string.compose_confirmation_deny_button, b), abgeVar.a), a2, (List) null, (doat) null, (dmeb) null, abgeVar.a, 944), hviVar, b, i2 & 112, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abgf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    abge abgeVar2 = abge.this;
                    int i4 = i;
                    abgg.a(abgeVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
