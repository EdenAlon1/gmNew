package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nme implements nkj {
    private final luv a = new luv();

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    @Override // defpackage.nkj
    public final void b(byte[] bArr, int i, int i2, nki nkiVar, lts ltsVar) {
        lsz a;
        this.a.I(bArr, i2 + i);
        this.a.K(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            luv luvVar = this.a;
            if (luvVar.b() <= 0) {
                ltsVar.a(new njp(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            lti.b(luvVar.b() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            luv luvVar2 = this.a;
            int e = luvVar2.e() - 8;
            if (luvVar2.e() == 1987343459) {
                luv luvVar3 = this.a;
                CharSequence charSequence = null;
                lsy lsyVar = null;
                while (e > 0) {
                    lti.b(e >= 8, "Incomplete vtt cue box header found.");
                    int e2 = luvVar3.e();
                    int e3 = luvVar3.e();
                    int i3 = e - 8;
                    int i4 = e2 - 8;
                    String I = lvf.I(luvVar3.a, luvVar3.b, i4);
                    luvVar3.L(i4);
                    if (e3 == 1937011815) {
                        Pattern pattern = nmn.a;
                        nmm nmmVar = new nmm();
                        nmn.c(I, nmmVar);
                        lsyVar = nmmVar.a();
                    } else if (e3 == 1885436268) {
                        charSequence = nmn.a(null, I.trim(), Collections.EMPTY_LIST);
                    }
                    e = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (lsyVar != null) {
                    lsyVar.a = charSequence;
                    a = lsyVar.a();
                } else {
                    Pattern pattern2 = nmn.a;
                    nmm nmmVar2 = new nmm();
                    nmmVar2.c = charSequence;
                    a = nmmVar2.a().a();
                }
                arrayList.add(a);
            } else {
                this.a.L(e);
            }
        }
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
