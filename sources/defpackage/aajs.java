package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajs {
    public static final enru a;
    private static final Map d = ffew.g(new ffcf("👍", "thumbs_up_reaction_effect.binarypb"), new ffcf("❤️", "love_reaction_effect.binarypb"), new ffcf("😂", "laugh_reaction_effect.binarypb"), new ffcf("😮", "surprise_reaction_effect.binarypb"), new ffcf("😢", "sad_reaction_effect.binarypb"), new ffcf("😡", "anger_reaction_effect.binarypb"), new ffcf("😠", "anger_reaction_effect.binarypb"), new ffcf("👎", "thumbs_down_reaction_effect.binarypb"), new ffcf("💩", "poop_reaction_effect.binarypb"), new ffcf("🎉", "celebrate_reaction_effect.binarypb"));
    public final ffbr b;
    public final Map c;
    private final ffsk e;
    private final Map f;

    static {
        ffew.g(new ffcf("👍", "thumbs_up_reaction_effect.binarypb"), new ffcf("👍🏻", "thumbs_up_reaction_effect.binarypb"), new ffcf("👍🏽", "thumbs_up_reaction_effect.binarypb"), new ffcf("👍🏿", "thumbs_up_reaction_effect.binarypb"), new ffcf("👍🏼", "thumbs_up_reaction_effect.binarypb"), new ffcf("👍🏾", "thumbs_up_reaction_effect.binarypb"), new ffcf("❤️", "love_reaction_effect.binarypb"), new ffcf("😂", "laugh_reaction_effect.binarypb"), new ffcf("😮", "surprise_reaction_effect.binarypb"), new ffcf("😢", "sad_reaction_effect.binarypb"), new ffcf("😡", "anger_reaction_effect.binarypb"), new ffcf("😠", "anger_reaction_effect.binarypb"), new ffcf("👎", "thumbs_down_reaction_effect.binarypb"), new ffcf("👎🏻", "thumbs_down_reaction_effect.binarypb"), new ffcf("👎🏽", "thumbs_down_reaction_effect.binarypb"), new ffcf("👎🏿", "thumbs_down_reaction_effect.binarypb"), new ffcf("👎🏼", "thumbs_down_reaction_effect.binarypb"), new ffcf("👎🏾", "thumbs_down_reaction_effect.binarypb"), new ffcf("💩", "poop_reaction_effect.binarypb"), new ffcf("🎉", "celebrate_reaction_effect.binarypb"));
        a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/effects/ReactionEffectAnimationMap");
    }

    public aajs(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.e = ffskVar;
        this.f = new LinkedHashMap();
        Map map = d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Set i = new dqqi(new dqnr(str)).i();
            ArrayList arrayList2 = new ArrayList(ffdx.n(i, 10));
            Iterator it = i.iterator();
            while (it.hasNext()) {
                arrayList2.add(((dqod) it.next()).a);
            }
            ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new ffcf((String) it2.next(), str2));
            }
            ffdx.w(arrayList, arrayList3);
        }
        Map k = ffew.k(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(k.size()));
        for (Map.Entry entry2 : k.entrySet()) {
            Object key = entry2.getKey();
            String str3 = (String) entry2.getValue();
            Map map2 = this.f;
            Object obj = map2.get(str3);
            if (obj == null) {
                fgcm a2 = fgdm.a(null);
                axol.k(this.e, null, new aajr(this, str3, a2, null), 3);
                map2.put(str3, a2);
                obj = a2;
            }
            linkedHashMap.put(key, (fgdj) obj);
        }
        this.c = linkedHashMap;
    }
}
