package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dtkj extends ffkh implements ffjm {
    public static final dtkj a = new dtkj();

    public dtkj() {
        super(2, dtkp.class, "getAnimatedEmojiModifierForPosition", "getAnimatedEmojiModifierForPosition(Landroidx/compose/foundation/layout/BoxScope;Lcom/google/android/libraries/communications/ux/components/voicemood/Position;)Landroidx/compose/ui/Modifier;", 1);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        dyh dyhVar = (dyh) obj;
        dovv dovvVar = (dovv) obj2;
        dyhVar.getClass();
        dovvVar.getClass();
        int ordinal = dovvVar.ordinal();
        if (ordinal == 0) {
            hvi k = ebs.k(hvi.e, 24.0f);
            int i = huo.a;
            return hxz.a(eau.b(dyhVar.a(k, hum.g), 105.0f, -14.0f), 10.0f);
        }
        if (ordinal == 1) {
            hvi k2 = ebs.k(hvi.e, 20.0f);
            int i2 = huo.a;
            return hxz.a(eau.b(dyhVar.a(k2, hum.c), -122.0f, 25.0f), -24.0f);
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        hvi k3 = ebs.k(hvi.e, 40.0f);
        int i3 = huo.a;
        return eau.b(dyhVar.a(k3, hum.c), -22.0f, 2.0f);
    }
}
