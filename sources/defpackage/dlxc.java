package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dlxc extends ffkh implements ffjm {
    public static final dlxc a = new dlxc();

    public dlxc() {
        super(2, dlxp.class, "getAnimatedEmojiModifierForPosition", "getAnimatedEmojiModifierForPosition(Landroidx/compose/foundation/layout/BoxScope;Lcom/google/android/libraries/communications/ux/components/voicemood/Position;)Landroidx/compose/ui/Modifier;", 1);
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
            return eau.b(dyhVar.a(k, hum.g), 64.0f, -4.0f);
        }
        if (ordinal == 1) {
            hvi k2 = ebs.k(hvi.e, 20.0f);
            int i2 = huo.a;
            return hxz.a(eau.b(dyhVar.a(k2, hum.i), -72.0f, -48.0f), -30.0f);
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        hvi k3 = ebs.k(hvi.e, 40.0f);
        int i3 = huo.a;
        return eau.b(dyhVar.a(k3, hum.c), -16.0f, -10.0f);
    }
}
