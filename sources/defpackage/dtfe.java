package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfe {
    public static final Uri a(dtfd dtfdVar) {
        dtez dtezVar;
        if (dtfdVar != null) {
            dtev dtevVar = dtfdVar.e;
            if (dtevVar == null) {
                dtevVar = dtev.a;
            }
            if (dtevVar != null) {
                dtezVar = dtevVar.b;
                if (dtezVar == null) {
                    dtezVar = dtez.a;
                }
                if (dtezVar == null && i(dtezVar)) {
                    return h(dtezVar);
                }
                return null;
            }
        }
        dtezVar = null;
        if (dtezVar == null) {
        }
        return null;
    }

    public static final dowd b(dtfd dtfdVar, boolean z) {
        dovv dovvVar;
        Uri uri = null;
        if (!d(dtfdVar)) {
            return null;
        }
        eygr eygrVar = dtfdVar.d;
        eygrVar.getClass();
        ArrayList<dtet> arrayList = new ArrayList();
        Iterator<E> it = eygrVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            dtet dtetVar = (dtet) next;
            dtetVar.getClass();
            dtez dtezVar = dtetVar.b;
            if (dtezVar == null) {
                dtezVar = dtez.a;
            }
            dtezVar.getClass();
            if (i(dtezVar)) {
                int a = dtfb.a(dtetVar.c);
                if (a == 0) {
                    a = 1;
                }
                if (a != 2 && a != 1) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        for (dtet dtetVar2 : arrayList) {
            dtetVar2.getClass();
            dtez dtezVar2 = dtetVar2.b;
            if (dtezVar2 == null) {
                dtezVar2 = dtez.a;
            }
            dtezVar2.getClass();
            String str = dtezVar2.b;
            str.getClass();
            int a2 = dtfa.a(dtezVar2.c);
            if (a2 == 0) {
                a2 = 1;
            }
            dnaw dnawVar = new dnaw(str, g(a2));
            int a3 = dtfb.a(dtetVar2.c);
            if (a3 == 0) {
                a3 = 1;
            }
            int i = a3 - 2;
            if (i == 1) {
                dovvVar = dovv.a;
            } else if (i == 2) {
                dovvVar = dovv.b;
            } else {
                if (i != 3) {
                    Objects.toString(dtfb.b(a3));
                    throw new UnsupportedOperationException("Invalid position: ".concat(dtfb.b(a3)));
                }
                dovvVar = dovv.c;
            }
            arrayList2.add(new dovu(dnawVar, dovvVar));
        }
        dtev dtevVar = dtfdVar.e;
        if (dtevVar == null) {
            dtevVar = dtev.a;
        }
        dtez dtezVar3 = dtevVar.b;
        if (dtezVar3 == null) {
            dtezVar3 = dtez.a;
        }
        dtezVar3.getClass();
        if (i(dtezVar3)) {
            dtev dtevVar2 = dtfdVar.e;
            if (dtevVar2 == null) {
                dtevVar2 = dtev.a;
            }
            dtez dtezVar4 = dtevVar2.b;
            if (dtezVar4 == null) {
                dtezVar4 = dtez.a;
            }
            dtezVar4.getClass();
            uri = h(dtezVar4);
        }
        Uri uri2 = uri;
        engw a4 = engq.a(arrayList2);
        dtev dtevVar3 = dtfdVar.e;
        if (dtevVar3 == null) {
            dtevVar3 = dtev.a;
        }
        dtex dtexVar = dtevVar3.c;
        if (dtexVar == null) {
            dtexVar = dtex.a;
        }
        long j = dtexVar.b;
        dtev dtevVar4 = dtfdVar.e;
        dtex dtexVar2 = (dtevVar4 == null ? dtev.a : dtevVar4).c;
        if (dtexVar2 == null) {
            dtexVar2 = dtex.a;
        }
        long j2 = dtexVar2.c;
        if (dtevVar4 == null) {
            dtevVar4 = dtev.a;
        }
        dtex dtexVar3 = dtevVar4.c;
        if (dtexVar3 == null) {
            dtexVar3 = dtex.a;
        }
        float f = dtexVar3.d;
        int b = dtfg.b(dtfdVar.c);
        return new dowd(a4, uri2, j, j2, f, z, f(b != 0 ? b : 1), true);
    }

    public static final boolean c(dteh dtehVar) {
        dtfd dtfdVar;
        if (dtehVar != null) {
            dtfdVar = dtehVar.c;
            if (dtfdVar == null) {
                dtfdVar = dtfd.a;
            }
        } else {
            dtfdVar = null;
        }
        return d(dtfdVar);
    }

    public static final boolean d(dtfd dtfdVar) {
        int i;
        int i2;
        if (dtfdVar != null) {
            i = dtfg.b(dtfdVar.c);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        return (i == 0 || (i2 = i + (-2)) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    public static final int f(int i) {
        switch (i - 2) {
            case 2:
                return R.string.celebrate_mood_content_description;
            case 3:
                return R.string.love_mood_content_description;
            case 4:
                return R.string.laughing_mood_content_description;
            case 5:
                return R.string.sobbing_mood_content_description;
            case 6:
                return R.string.happy_mood_content_description;
            case 7:
                return R.string.angry_mood_content_description;
            case 8:
                return R.string.shocked_mood_content_description;
            case 9:
                return R.string.annoyed_mood_content_description;
            case 10:
                return R.string.sad_mood_content_description;
            default:
                return R.string.no_mood_content_description;
        }
    }

    public static final String g(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "animated_emoji";
        }
        if (i2 == 2) {
            return "voice_moods";
        }
        Objects.toString(dtfa.b(i));
        throw new IllegalArgumentException("Invalid file group: ".concat(dtfa.b(i)));
    }

    private static final Uri h(dtez dtezVar) {
        Uri.Builder scheme = new Uri.Builder().scheme("mdd");
        int a = dtfa.a(dtezVar.c);
        if (a == 0) {
            a = 1;
        }
        return scheme.authority(g(a)).appendPath(dtezVar.b).build();
    }

    private static final boolean i(dtez dtezVar) {
        int a;
        String str = dtezVar.b;
        str.getClass();
        if (ffpc.J(str)) {
            return false;
        }
        int i = dtezVar.c;
        int a2 = dtfa.a(i);
        return ((a2 != 0 && a2 == 2) || (a = dtfa.a(i)) == 0 || a == 1) ? false : true;
    }
}
