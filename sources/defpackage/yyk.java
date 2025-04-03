package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyk implements yyb {
    public final ffbr a;
    public final fgdj b;
    public final fgdj c;
    private final ffsk d;
    private final yyv e;
    private final ausa f;
    private final attl g;
    private final yzn h;
    private final zap i;
    private final ffbz j;
    private final yyu k;

    public yyk(ffsk ffskVar, yyv yyvVar, ausa ausaVar, attl attlVar, yzn yznVar, zap zapVar, yyu yyuVar, ffbr ffbrVar) {
        ffxx axqdVar;
        ffxx axqdVar2;
        ffskVar.getClass();
        ausaVar.getClass();
        attlVar.getClass();
        ffbrVar.getClass();
        this.d = ffskVar;
        this.e = yyvVar;
        this.f = ausaVar;
        this.g = attlVar;
        this.h = yznVar;
        this.i = zapVar;
        this.k = yyuVar;
        this.a = ffbrVar;
        this.j = ffca.a(new ffix() { // from class: yyg
            @Override // defpackage.ffix
            public final Object invoke() {
                return (Optional) yyk.this.a.b();
            }
        });
        if (((Boolean) ((cfup) cudz.a.get()).e()).booleanValue()) {
            axqdVar = new axqd(new ffix() { // from class: yyh
                @Override // defpackage.ffix
                public final Object invoke() {
                    return null;
                }
            });
        } else {
            yzm yzmVar = (yzm) yyvVar;
            String string = yzmVar.b.getString(R.string.unwanted_messages_toolstone_link);
            string.getClass();
            String string2 = yzmVar.b.getString(R.string.unwanted_messages_toolstone_text, string);
            string2.getClass();
            fgch fgchVar = new fgch(fgck.a(yzmVar.j, yzmVar.h, yzmVar.l, new yzc(string2, string, yzmVar, null)), new fgbt(new yyy(yzmVar.k), new yze(yzmVar, null)), new yyz(null));
            ffsk ffskVar2 = yzmVar.c;
            int i = fgcz.a;
            axqdVar = fgbn.b(fgchVar, ffskVar2, fgcy.a, null);
        }
        ffxx axqdVar3 = ausaVar.a() ? ((yzt) yznVar).e : new axqd(new ffix() { // from class: yyd
            @Override // defpackage.ffix
            public final Object invoke() {
                return null;
            }
        });
        ffxx axqdVar4 = ((Boolean) ((cfup) cudz.a.get()).e()).booleanValue() ? ((zba) zapVar).i : new axqd(new ffix() { // from class: yyc
            @Override // defpackage.ffix
            public final Object invoke() {
                return null;
            }
        });
        if (attlVar.a()) {
            yyo yyoVar = new yyo(yyuVar.e, yyuVar);
            ffsk ffskVar3 = yyuVar.b;
            int i2 = fgcz.a;
            axqdVar2 = fgbn.b(yyoVar, ffskVar3, fgcy.a, null);
        } else {
            axqdVar2 = new axqd(new ffix() { // from class: yyf
                @Override // defpackage.ffix
                public final Object invoke() {
                    return null;
                }
            });
        }
        ffxx b = fgck.b(axqdVar, axqdVar3, axqdVar4, axqdVar2, new yyj(null));
        int i3 = fgcz.a;
        fgdj b2 = fgbn.b(b, ffskVar, fgcy.a, null);
        this.b = b2;
        this.c = fgbn.b(new fgch(b2, (((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue() && a().isPresent()) ? ((zab) a().get()).a() : new axqd(new ffix() { // from class: yye
            @Override // defpackage.ffix
            public final Object invoke() {
                return null;
            }
        }), new yyi(null)), ffskVar, fgcy.a, null);
    }

    private final Optional a() {
        return (Optional) this.j.a();
    }
}
