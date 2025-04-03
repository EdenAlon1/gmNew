package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzte implements dzdu {
    private final Context a;

    public dzte(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzdu
    public final dzqk a(dzja dzjaVar, fblh fblhVar) {
        dzvt dztrVar;
        byte[] bArr;
        emxc emxcVar;
        emxc emxcVar2;
        String str = fblhVar.i;
        fbjt b = fbjt.b(fblhVar.n);
        if (b == null) {
            b = fbjt.UNRECOGNIZED;
        }
        if (!b.equals(fbjt.RICH_CARD) || fblhVar.e != 107) {
            dyhr.c("RichCardMsgConv", "Attempted to convert non-rich card LighterMessage");
            return dzky.b(eyee.b);
        }
        Context context = this.a;
        dzno dznoVar = new dzno();
        fbmh fbmhVar = (fbmh) fblhVar.f;
        dyyt a = dyyt.a(context);
        int i = dztl.b;
        int i2 = fbmhVar.d;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = i3 - 2;
        if (i4 == 1) {
            dzvv a2 = dztl.a(dzjaVar, context, fbmhVar.b == 101 ? (fbmp) fbmhVar.c : fbmp.a, str, a);
            int i5 = dzvt.a;
            dztrVar = new dztr(a2);
        } else if (i4 == 2) {
            fbmt fbmtVar = fbmhVar.b == 102 ? (fbmt) fbmhVar.c : fbmt.a;
            String str2 = dzvx.c;
            dzuu dzuuVar = new dzuu();
            dzuuVar.b(fbmtVar.b);
            fbmp fbmpVar = fbmtVar.c;
            if (fbmpVar == null) {
                fbmpVar = fbmp.a;
            }
            dzuuVar.a = dztl.a(dzjaVar, context, fbmpVar, str, a);
            dzvx a3 = dzuuVar.a();
            int i6 = dzvt.a;
            dztrVar = new dzts(a3);
        } else {
            if (i4 != 3) {
                throw new dzdt("Got unknown rich card type: " + i2, 221);
            }
            fblx fblxVar = fbmhVar.b == 103 ? (fblx) fbmhVar.c : fblx.a;
            engr engrVar = new engr();
            Iterator<E> it = fblxVar.d.iterator();
            while (it.hasNext()) {
                engrVar.h(dztl.a(dzjaVar, context, (fbmp) it.next(), str, a));
            }
            String str3 = dzvd.d;
            dzug dzugVar = new dzug();
            dzugVar.d(fblxVar.b);
            dzugVar.b(fblxVar.c);
            dzugVar.c(engrVar.g());
            dzvd a4 = dzugVar.a();
            int i7 = dzvt.a;
            dztrVar = new dztq(a4);
        }
        try {
            final HashMap hashMap = new HashMap();
            hashMap.put(VCardConstants.PARAM_TYPE, Integer.valueOf(dztrVar.b().d));
            int ordinal = dztrVar.b().ordinal();
            if (ordinal == 0) {
                dzvv c = dztrVar.c();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("COMPONENTS", dyhx.d(((dzut) c).a, new emwl() { // from class: dzta
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dzwd dzwdVar = (dzwd) obj;
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(VCardConstants.PARAM_TYPE, dzwdVar.a());
                        int ordinal2 = dzwdVar.a().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                return hashMap3;
                            }
                            hashMap3.put("UI_ELEMENT", dztd.b(dzwdVar.c()));
                            return hashMap3;
                        }
                        dzwc b2 = dzwdVar.b();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("ELEMENTS", dyhx.d(((dzuz) b2).a, new emwl() { // from class: dztb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return dztd.b((dzwi) obj2);
                            }
                        }));
                        hashMap3.put("STACK_COMPONENT", hashMap4);
                        return hashMap3;
                    }
                }));
                if (((dzut) c).b.g()) {
                    hashMap2.put("PREFERRED_MAX_WIDTH", ((dzut) c).b.c());
                }
                hashMap.put("STACK_CARD", hashMap2);
            } else if (ordinal == 1) {
                dzvx d = dztrVar.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("JSON_SOURCE", ((dzuv) d).a);
                    emxc d2 = ((dzuv) d).b.d();
                    if (d2.g()) {
                        jSONObject.put("STACK_CARD", d2.c());
                        emxcVar = emxc.j(jSONObject);
                    } else {
                        dyhr.c(dzvx.c, "Failed to convert StandaloneCard to JSONObject.");
                        emxcVar = emux.a;
                    }
                } catch (JSONException e) {
                    dyhr.d(dzvx.c, "Failed to convert StandaloneCard to JSONObject.", e);
                    emxcVar = emux.a;
                }
                dyht.b(emxcVar, new ksp() { // from class: dzsy
                    @Override // defpackage.ksp
                    public final void accept(Object obj) {
                        hashMap.put("STANDALONE_CARD", ((JSONObject) obj).toString());
                    }
                });
            } else if (ordinal == 2) {
                dzvd a5 = dztrVar.a();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("CARD_WIDTH", ((dzuh) a5).a);
                    jSONObject2.put("JSON_SOURCE", ((dzuh) a5).b);
                    JSONArray jSONArray = new JSONArray();
                    enqv it2 = ((dzuh) a5).c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            jSONObject2.put("CARDS", jSONArray);
                            emxcVar2 = emxc.j(jSONObject2);
                            break;
                        }
                        emxc d3 = ((dzvv) it2.next()).d();
                        if (!d3.g()) {
                            dyhr.c(dzvd.d, "Failed to convert CardCarousel to JSONObject.");
                            emxcVar2 = emux.a;
                            break;
                        }
                        jSONArray.put(d3.c());
                    }
                } catch (JSONException e2) {
                    dyhr.d(dzvd.d, "Failed to convert CardCarousel to JSONObject.", e2);
                    emxcVar2 = emux.a;
                }
                dyht.b(emxcVar2, new ksp() { // from class: dzsz
                    @Override // defpackage.ksp
                    public final void accept(Object obj) {
                        hashMap.put("CARD_CAROUSEL", ((JSONObject) obj).toString());
                    }
                });
            }
            bArr = dyhu.i(hashMap);
        } catch (IOException | IllegalArgumentException e3) {
            dyhr.d("RichCardUtils", "Failed to serialize Rich Card", e3);
            bArr = new byte[0];
        }
        dznoVar.b(bArr);
        dznoVar.a = "rich_card";
        return new dzkt(dznoVar.a());
    }

    @Override // defpackage.dzdu
    public final fblf b(dzqs dzqsVar) {
        emxc emxcVar;
        emxc emxcVar2;
        emxc emxcVar3;
        emxc emxcVar4;
        if (dzqsVar.h().a() == 3 && ((dznp) dzqsVar.h().b()).a.equals("rich_card")) {
            HashMap g = dyhu.g(((dznp) dzqsVar.h().b()).b);
            try {
                final int i = dzvs.STACK_CARD.d;
                if (g.containsKey(VCardConstants.PARAM_TYPE)) {
                    i = ((Integer) g.get(VCardConstants.PARAM_TYPE)).intValue();
                }
                dzvs dzvsVar = (dzvs) enfc.e(dzvs.values()).a(new emxg() { // from class: dzvr
                    @Override // defpackage.emxg
                    public final boolean a(Object obj) {
                        return ((dzvs) obj).d == i;
                    }
                }).f();
                if (dzvsVar == null) {
                    throw new InvalidParameterException("Invalid CardType.");
                }
                int ordinal = dzvsVar.ordinal();
                if (ordinal == 0) {
                    emxc b = dyhu.b(g.get("STACK_CARD"));
                    if (b.g()) {
                        Object c = b.c();
                        try {
                            int i2 = dzvv.c;
                            dzus dzusVar = new dzus();
                            dzusVar.b(dyhx.c((ArrayList) ((HashMap) c).get("COMPONENTS"), new emwl() { // from class: dzsx
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    emxc emxcVar5;
                                    emxc emxcVar6;
                                    HashMap hashMap = (HashMap) obj;
                                    try {
                                        int ordinal2 = ((dzwa) hashMap.get(VCardConstants.PARAM_TYPE)).ordinal();
                                        if (ordinal2 != 0) {
                                            emxcVar5 = ordinal2 != 1 ? emux.a : emxc.j(new dztv((dzwi) dztd.a((HashMap) hashMap.get("UI_ELEMENT")).c()));
                                        } else {
                                            HashMap hashMap2 = (HashMap) hashMap.get("STACK_COMPONENT");
                                            try {
                                                dzuy dzuyVar = new dzuy();
                                                dzuyVar.b(dyhx.b((ArrayList) hashMap2.get("ELEMENTS"), new emwl() { // from class: dztc
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj2) {
                                                        return dztd.a((HashMap) obj2);
                                                    }
                                                }));
                                                emxcVar6 = emxc.j(dzuyVar.a());
                                            } catch (Exception e) {
                                                dyhr.d("UiComponentConverters", "failed to convert HashMap to StackComponent", e);
                                                emxcVar6 = emux.a;
                                            }
                                            emxcVar5 = emxc.j(new dztu((dzwc) emxcVar6.c()));
                                        }
                                    } catch (Exception e2) {
                                        dyhr.d("UiComponentConverters", "failed to convert HashMap to UiComponent", e2);
                                        emxcVar5 = emux.a;
                                    }
                                    return emxcVar5.c();
                                }
                            }));
                            if (((HashMap) c).containsKey("PREFERRED_MAX_WIDTH")) {
                                dzusVar.c(((Integer) ((HashMap) c).get("PREFERRED_MAX_WIDTH")).intValue());
                            }
                            emxcVar2 = emxc.j(dzusVar.a());
                        } catch (Exception e) {
                            dyhr.d("RichCardConverters", "failed to convert HashMap to StackCard", e);
                            emxcVar2 = emux.a;
                        }
                        Object c2 = emxcVar2.c();
                        int i3 = dzvt.a;
                        emxcVar = emxc.j(new dztr((dzvv) c2));
                    } else {
                        dyhr.c("RichCardConverters", "failed to convert HashMap to RichCard");
                        dyhr.c("RichCardConverters", a.G(dzvsVar, "failed to convert HashMap to RichCard, unsupported type: "));
                        emxcVar = emux.a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        String str = (String) g.get("CARD_CAROUSEL");
                        String str2 = dzvd.d;
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            dzug dzugVar = new dzug();
                            dzugVar.b(jSONObject.getInt("CARD_WIDTH"));
                            dzugVar.d(jSONObject.getString("JSON_SOURCE"));
                            int i4 = engw.d;
                            engr engrVar = new engr();
                            JSONArray jSONArray = jSONObject.getJSONArray("CARDS");
                            int i5 = 0;
                            while (true) {
                                if (i5 >= jSONArray.length()) {
                                    dzugVar.c(engrVar.g());
                                    emxcVar4 = emxc.j(dzugVar.a());
                                    break;
                                }
                                emxc c3 = dzvv.c(jSONArray.getJSONObject(i5));
                                if (!c3.g()) {
                                    dyhr.c(dzvd.d, "Failed to convert JSONObject to CardCarousel.");
                                    emxcVar4 = emux.a;
                                    break;
                                }
                                engrVar.h(c3.c());
                                i5++;
                            }
                        } catch (JSONException e2) {
                            dyhr.d(dzvd.d, "Failed to convert JSONObject to CardCarousel.", e2);
                            emxcVar4 = emux.a;
                        }
                        if (emxcVar4.g()) {
                            Object c4 = emxcVar4.c();
                            int i6 = dzvt.a;
                            emxcVar = emxc.j(new dztq((dzvd) c4));
                        } else {
                            dyhr.c("RichCardConverters", "failed to convert HashMap to RichCard");
                        }
                    }
                    dyhr.c("RichCardConverters", a.G(dzvsVar, "failed to convert HashMap to RichCard, unsupported type: "));
                    emxcVar = emux.a;
                } else {
                    String str3 = (String) g.get("STANDALONE_CARD");
                    String str4 = dzvx.c;
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        dzuu dzuuVar = new dzuu();
                        dzuuVar.b(jSONObject2.getString("JSON_SOURCE"));
                        emxc c5 = dzvv.c(jSONObject2.getJSONObject("STACK_CARD"));
                        if (c5.g()) {
                            dzuuVar.a = (dzvv) c5.c();
                            emxcVar3 = emxc.j(dzuuVar.a());
                        } else {
                            dyhr.c(dzvx.c, "Failed to convert JSONObject to StandaloneCard.");
                            emxcVar3 = emux.a;
                        }
                    } catch (JSONException e3) {
                        dyhr.d(dzvx.c, "Failed to convert JSONObject to StandaloneCard.", e3);
                        emxcVar3 = emux.a;
                    }
                    if (emxcVar3.g()) {
                        Object c6 = emxcVar3.c();
                        int i7 = dzvt.a;
                        emxcVar = emxc.j(new dzts((dzvx) c6));
                    } else {
                        dyhr.c("RichCardConverters", "failed to convert HashMap to RichCard");
                        dyhr.c("RichCardConverters", a.G(dzvsVar, "failed to convert HashMap to RichCard, unsupported type: "));
                        emxcVar = emux.a;
                    }
                }
            } catch (Exception e4) {
                dyhr.d("RichCardConverters", "failed to convert HashMap to RichCard", e4);
                emxcVar = emux.a;
            }
        } else {
            emxcVar = emux.a;
        }
        if (!emxcVar.g()) {
            dyhr.c("RichCardMsgConv", "Attempted to convert non-rich_card message");
            fblf fblfVar = (fblf) fblh.a.createBuilder();
            fbjt fbjtVar = fbjt.UNKNOWN;
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).n = fbjtVar.a();
            return fblfVar;
        }
        Object c7 = emxcVar.c();
        fblf fblfVar2 = (fblf) fblh.a.createBuilder();
        try {
            fbjt fbjtVar2 = fbjt.RICH_CARD;
            fblfVar2.copyOnWrite();
            ((fblh) fblfVar2.instance).n = fbjtVar2.a();
            int i8 = dztl.b;
        } catch (Exception unused) {
            dyhr.c("RichCardMsgConv", "Failed to convert rich card model.");
            fbjt fbjtVar3 = fbjt.UNKNOWN;
            fblfVar2.copyOnWrite();
            ((fblh) fblfVar2.instance).n = fbjtVar3.a();
        }
        if (((dzvt) c7).b().ordinal() != 0) {
            throw new IllegalArgumentException("Got unknown rich card model type");
        }
        fbmg fbmgVar = (fbmg) fbmh.a.createBuilder();
        dzvv c8 = ((dzvt) c7).c();
        fbmo fbmoVar = (fbmo) fbmp.a.createBuilder();
        engw c9 = dyhx.c(((dzut) c8).a, new emwl() { // from class: dztg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dzwd dzwdVar = (dzwd) obj;
                int i9 = dztl.b;
                int ordinal2 = dzwdVar.a().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new IllegalArgumentException("Got unknown ui component model type");
                    }
                    fbmw fbmwVar = (fbmw) fbmx.a.createBuilder();
                    fbmwVar.copyOnWrite();
                    ((fbmx) fbmwVar.instance).d = fbjz.a(4);
                    fbmz c10 = dztl.c(dzwdVar.c());
                    fbmwVar.copyOnWrite();
                    fbmx fbmxVar = (fbmx) fbmwVar.instance;
                    c10.getClass();
                    fbmxVar.c = c10;
                    fbmxVar.b = 102;
                    return (fbmx) fbmwVar.build();
                }
                fbmw fbmwVar2 = (fbmw) fbmx.a.createBuilder();
                fbmwVar2.copyOnWrite();
                ((fbmx) fbmwVar2.instance).d = fbjz.a(3);
                dzwc b2 = dzwdVar.b();
                fbmq fbmqVar = (fbmq) fbmr.a.createBuilder();
                engw c11 = dyhx.c(((dzuz) b2).a, new emwl() { // from class: dztj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return dztl.c((dzwi) obj2);
                    }
                });
                fbmqVar.copyOnWrite();
                fbmr fbmrVar = (fbmr) fbmqVar.instance;
                eygr eygrVar = fbmrVar.b;
                if (!eygrVar.c()) {
                    fbmrVar.b = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(c11, fbmrVar.b);
                fbmr fbmrVar2 = (fbmr) fbmqVar.build();
                fbmwVar2.copyOnWrite();
                fbmx fbmxVar2 = (fbmx) fbmwVar2.instance;
                fbmrVar2.getClass();
                fbmxVar2.c = fbmrVar2;
                fbmxVar2.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                return (fbmx) fbmwVar2.build();
            }
        });
        fbmoVar.copyOnWrite();
        fbmp fbmpVar = (fbmp) fbmoVar.instance;
        eygr eygrVar = fbmpVar.b;
        if (!eygrVar.c()) {
            fbmpVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(c9, fbmpVar.b);
        if (((dzut) c8).b.g()) {
            int intValue = ((Integer) ((dzut) c8).b.c()).intValue();
            fbmoVar.copyOnWrite();
            ((fbmp) fbmoVar.instance).c = intValue;
        }
        fbmp fbmpVar2 = (fbmp) fbmoVar.build();
        fbmgVar.copyOnWrite();
        fbmh fbmhVar = (fbmh) fbmgVar.instance;
        fbmpVar2.getClass();
        fbmhVar.c = fbmpVar2;
        fbmhVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        fbmgVar.copyOnWrite();
        ((fbmh) fbmgVar.instance).d = 1;
        fbmh fbmhVar2 = (fbmh) fbmgVar.build();
        fblfVar2.copyOnWrite();
        fblh fblhVar = (fblh) fblfVar2.instance;
        fbmhVar2.getClass();
        fblhVar.f = fbmhVar2;
        fblhVar.e = 107;
        return fblfVar2;
    }
}
