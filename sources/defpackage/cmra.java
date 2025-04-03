package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmra {
    public static final /* synthetic */ int a = 0;
    private static final ffbz b = ffca.a(new ffix() { // from class: cmqz
        @Override // defpackage.ffix
        public final Object invoke() {
            int i = cmra.a;
            cmrb cmrbVar = (cmrb) cmrd.a.createBuilder();
            cmrbVar.getClass();
            DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cmrd) cmrbVar.instance).b)).getClass();
            Map g = ffew.g(new ffcf("loved", cmrq.a(cmrv.RED_HEART).d), new ffcf("heart", cmrq.a(cmrv.RED_HEART).d), new ffcf("liked", cmrq.a(cmrv.LIKE).d), new ffcf("like", cmrq.a(cmrv.LIKE).d), new ffcf("disliked", cmrq.a(cmrv.DISLIKE).d), new ffcf("dislike", cmrq.a(cmrv.DISLIKE).d), new ffcf("laughed at", cmrq.a(cmrv.LAUGH).d), new ffcf("laugh", cmrq.a(cmrv.LAUGH).d), new ffcf("emphasized", "‼️"), new ffcf("emphasised", "‼️"), new ffcf("exclamation", "‼️"), new ffcf("exclamation mark", "‼️"), new ffcf("questioned", "❓"), new ffcf("question mark", "❓"));
            cmrbVar.copyOnWrite();
            cmrd cmrdVar = (cmrd) cmrbVar.instance;
            eyhm eyhmVar = cmrdVar.b;
            if (!eyhmVar.b) {
                cmrdVar.b = eyhmVar.a();
            }
            cmrdVar.b.putAll(g);
            eyfy build = cmrbVar.build();
            build.getClass();
            return (cmrd) build;
        }
    });

    public static final cmrd a() {
        return (cmrd) b.a();
    }
}
