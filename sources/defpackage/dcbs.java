package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.emoji.EmojiContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbs extends dbzy {
    private static final eptv f;
    private final dcbr g;
    private final alcb h;
    private final czes i;
    private final czdp j;
    private final encw k;

    static {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        epts eptsVar = epts.EMOJI;
        eptqVar.copyOnWrite();
        eptv eptvVar = (eptv) eptqVar.instance;
        eptvVar.c = eptsVar.v;
        eptvVar.b |= 1;
        eptu eptuVar = eptu.COLLAPSED;
        eptqVar.copyOnWrite();
        eptv eptvVar2 = (eptv) eptqVar.instance;
        eptvVar2.d = eptuVar.e;
        eptvVar2.b |= 2;
        f = (eptv) eptqVar.build();
    }

    public dcbs(alcb alcbVar, czes czesVar, czdp czdpVar, dcbr dcbrVar, dcab dcabVar, ContentGridView contentGridView, int i) {
        super(dcbrVar, dcabVar, contentGridView, i);
        this.k = new enfy();
        this.g = dcbrVar;
        this.h = alcbVar;
        this.i = czesVar;
        this.j = czdpVar;
    }

    @Override // defpackage.dbzy
    public final void d(dcal dcalVar, int i) {
        super.d(dcalVar, i);
        EmojiContentItemView emojiContentItemView = (EmojiContentItemView) dcalVar;
        String b = ((dcbx) this.g.b.get(i)).b();
        if (!this.k.a().containsKey(b)) {
            this.k.put(this.j.a(this.i.b(b)), b);
        }
        dcbo dcboVar = new dcbo((String) this.k.a().get(b));
        emojiContentItemView.b = dcboVar;
        emojiContentItemView.a.setText(dcboVar.a);
    }

    @Override // defpackage.dbzy
    protected final void f(dcal dcalVar, int i) {
        dcbx dcbxVar = ((EmojiContentItemView) dcalVar).b;
        dcbo dcboVar = (dcbo) dcbxVar;
        String str = dcboVar.a;
        if (this.k.containsKey(str)) {
            this.g.c.b((String) this.k.get(str));
        } else {
            csjy.o("Bugle", "Attempted to mark emoji %1$s as recent, but emoji is not displayed currently.", str);
        }
        if (!((Boolean) cful.o.e()).booleanValue()) {
            this.a.i(dcbxVar, false);
            this.h.e(f, i);
            return;
        }
        dbzn dbznVar = this.a;
        uek uekVar = new uek(dcboVar.a);
        eptv eptvVar = f;
        dcle dcleVar = dcle.a;
        int i2 = dclf.b;
        dbznVar.k(uekVar, new dclg(eptvVar), false, i);
    }
}
