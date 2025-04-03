package defpackage;

import j$.util.Optional;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abho {
    public static final dqgm a = new dqgm(-1000000001);
    public static final enru b = enru.c("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer");
    public final abgu c;
    public final dsfh d;
    public final dsma e;
    public final abgx f;
    public final dqnj g;
    public final ffbz h;
    public final ffbz i;
    public final ffbz j;
    public ffix k;
    public ffix l;
    public ffji m;
    public abgm n;
    public ffji o;
    public final dqlx p;
    public final abhk q;
    public dsfg r;

    public abho(abgu abguVar, dsfh dsfhVar, dsma dsmaVar, final Optional optional, final Optional optional2, final Optional optional3, dqki dqkiVar, dqnk dqnkVar, abgx abgxVar) {
        dsmaVar.getClass();
        dqkiVar.getClass();
        this.c = abguVar;
        this.d = dsfhVar;
        this.e = dsmaVar;
        this.f = abgxVar;
        this.g = dqnkVar.a(dqkiVar, a);
        this.h = ffca.a(new ffix() { // from class: abgz
            @Override // defpackage.ffix
            public final Object invoke() {
                return (dqsv) ((ffbr) Optional.this.orElse(new ffbr() { // from class: abhf
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return new dqsv(null, null, PrivateKeyType.INVALID);
                    }
                })).b();
            }
        });
        this.i = ffca.a(new ffix() { // from class: abha
            @Override // defpackage.ffix
            public final Object invoke() {
                return (dqdf) ((ffbr) Optional.this.orElse(new ffbr() { // from class: abhe
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return new dqdf((dqgf) null, (dpnj) null, (ffbz) null, false, false, false, false, 1023);
                    }
                })).b();
            }
        });
        this.j = ffca.a(new ffix() { // from class: abhb
            @Override // defpackage.ffix
            public final Object invoke() {
                return (drxd) ((ffbr) Optional.this.orElse(new ffbr() { // from class: abhc
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return new drxd(false, false, false, false, 0.0f, false, 2047);
                    }
                })).b();
            }
        });
        this.p = new abhj(this);
        this.q = new abhk(this);
    }
}
