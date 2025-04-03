package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.mediapipe.framework.AndroidAssetUtil;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlv extends ffhv implements ffjm {
    final /* synthetic */ dtma a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtlv(dtma dtmaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dtmaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtlv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        facm facmVar;
        ffci.b(obj);
        String str = detj.a;
        Context context = this.a.a;
        InputStream open = context.getAssets().open("android_messages_catalog.binaryproto");
        try {
            byte[] b = eoej.b(open);
            if (open != null) {
                open.close();
            }
            AndroidAssetUtil.a(context);
            ArrayList arrayList = new ArrayList();
            Log.d(detj.a, "Loading catalog");
            facg facgVar = (facg) eyfy.parseFrom(facg.a, b, eyfc.a());
            for (faci faciVar : facgVar.b) {
                Log.d(detj.a, "ES loading category ".concat(String.valueOf(faciVar.b)));
                ArrayList arrayList2 = new ArrayList();
                for (fack fackVar : faciVar.c) {
                    Log.d(detj.a, "ES loading effect ".concat(String.valueOf(fackVar.b)));
                    String str2 = fackVar.c;
                    str2.getClass();
                    eyhm eyhmVar = facgVar.e;
                    detn detnVar = null;
                    byte[] I = (eyhmVar.containsKey(str2) ? (eyee) eyhmVar.get(str2) : null).I();
                    int i = 0;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(I, 0, I.length);
                    if (DesugarCollections.unmodifiableMap(facgVar.c).isEmpty()) {
                        String str3 = fackVar.b;
                        facm facmVar2 = facm.a;
                        str3.getClass();
                        eyhm eyhmVar2 = facgVar.d;
                        facmVar = eyhmVar2.containsKey(str3) ? (facm) eyhmVar2.get(str3) : facmVar2;
                    } else {
                        facl faclVar = (facl) facm.a.createBuilder();
                        String str4 = fackVar.b;
                        fadn fadnVar = fadn.a;
                        str4.getClass();
                        eyhm eyhmVar3 = facgVar.c;
                        if (eyhmVar3.containsKey(str4)) {
                            fadnVar = (fadn) eyhmVar3.get(str4);
                        }
                        faclVar.copyOnWrite();
                        facm facmVar3 = (facm) faclVar.instance;
                        fadnVar.getClass();
                        facmVar3.c = fadnVar;
                        facmVar3.b = 1;
                        facmVar = (facm) faclVar.build();
                    }
                    int i2 = facmVar.b;
                    if (i2 == 0) {
                        i = 4;
                    } else if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 2) {
                        i = 2;
                    } else if (i2 == 3) {
                        i = 3;
                    }
                    if (i == 0) {
                        throw null;
                    }
                    int i3 = i - 1;
                    if (i3 == 0) {
                        detnVar = new detn(fackVar.b, i2 == 1 ? (fadn) facmVar.c : fadn.a, decodeByteArray);
                    } else if (i3 == 1) {
                        String str5 = fackVar.b;
                        if (i2 == 2) {
                        } else {
                            facu facuVar = facu.a;
                        }
                        detnVar = new detn(str5, decodeByteArray, (byte[]) null);
                    } else if (i3 != 2) {
                        Log.w(detj.a, "ES loading effect unknown variant ".concat(String.valueOf(fackVar.b)));
                    } else {
                        String str6 = fackVar.b;
                        if (i2 == 3) {
                        } else {
                            facs facsVar = facs.a;
                        }
                        detnVar = new detn(str6, decodeByteArray);
                    }
                    String str7 = fackVar.d;
                    arrayList2.add(detnVar);
                }
                arrayList.add(new detk(faciVar.b, arrayList2));
            }
            return arrayList;
        } catch (Throwable th) {
            if (open == null) {
                throw th;
            }
            try {
                open.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtlv(this.a, ffguVar);
    }
}
