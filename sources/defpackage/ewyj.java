package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextLinks;
import j$.time.TimeConversions;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewyj extends ewzc {
    public static final /* synthetic */ int b = 0;
    public final TextClassifier a;
    private final Context c;

    public ewyj(Context context, TextClassifier textClassifier) {
        this.c = context;
        textClassifier.getClass();
        this.a = textClassifier;
        if (ewyd.b == null) {
            int i = ewyc.a;
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            Object systemService = applicationContext.getSystemService("user");
            Bundle userRestrictions = systemService instanceof UserManager ? ((UserManager) systemService).getUserRestrictions() : new Bundle();
            applicationContext.getClass();
            packageManager.getClass();
            userRestrictions.getClass();
            ewyd.b = new ewyd();
        }
    }

    @Override // defpackage.ewzc
    public final ewyx a(ewyw ewywVar) {
        TextClassification classifyText;
        TextClassification.Request.Builder defaultLocales;
        TextClassification.Request.Builder referenceTime;
        TextClassification.Request build;
        TextClassification classifyText2;
        c();
        if (Build.VERSION.SDK_INT < 28) {
            Context context = this.c;
            classifyText = this.a.classifyText(ewywVar.a, ewywVar.b, ewywVar.c, ewxe.a(ewywVar.d));
            return ewyx.b(context, classifyText);
        }
        Context context2 = this.c;
        TextClassifier textClassifier = this.a;
        defaultLocales = new TextClassification.Request.Builder(ewywVar.a, ewywVar.b, ewywVar.c).setDefaultLocales(ewxe.a(ewywVar.d));
        referenceTime = defaultLocales.setReferenceTime(TimeConversions.convert((ZonedDateTime) null));
        build = referenceTime.build();
        classifyText2 = textClassifier.classifyText(build);
        return ewyx.b(context2, classifyText2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Bundle, android.text.util.Linkify$MatchFilter] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // defpackage.ewzc
    public final exap b(exal exalVar) {
        int i;
        int i2;
        int i3;
        int i4;
        TextLinks.Request.Builder defaultLocales;
        TextLinks.Request.Builder entityConfig;
        TextLinks.Request build;
        TextLinks generateLinks;
        Collection links;
        int start;
        int end;
        int entityCount;
        String entity;
        float confidenceScore;
        c();
        ?? r2 = 0;
        int i5 = 0;
        int i6 = 28;
        if (Build.VERSION.SDK_INT >= 28) {
            TextClassifier textClassifier = this.a;
            defaultLocales = new TextLinks.Request.Builder(exalVar.a).setDefaultLocales(null);
            entityConfig = defaultLocales.setEntityConfig(exalVar.b.a());
            build = entityConfig.build();
            generateLinks = textClassifier.generateLinks(build);
            CharSequence charSequence = exalVar.a;
            int i7 = exap.f;
            generateLinks.getClass();
            charSequence.getClass();
            links = generateLinks.getLinks();
            String charSequence2 = charSequence.toString();
            charSequence2.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = links.iterator();
            while (it.hasNext()) {
                TextLinks.TextLink m33m = abj$$ExternalSyntheticApiModelOutline0.m33m(it.next());
                start = m33m.getStart();
                end = m33m.getEnd();
                m33m.getClass();
                entityCount = m33m.getEntityCount();
                cmh cmhVar = new cmh(entityCount);
                for (int i8 = 0; i8 < entityCount; i8++) {
                    entity = m33m.getEntity(i8);
                    confidenceScore = m33m.getConfidenceScore(entity);
                    cmhVar.put(entity, Float.valueOf(confidenceScore));
                }
                exag.b(start, end, cmhVar, arrayList);
            }
            return exag.a(charSequence2, arrayList, null);
        }
        Collection<String> b2 = exalVar.b.b(ewyd.a);
        String charSequence3 = exalVar.a.toString();
        charSequence3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (String str : b2) {
            int hashCode = str.hashCode();
            int i9 = 2;
            if (hashCode == 116079) {
                if (str.equals("url")) {
                    i = i5;
                }
                i = -1;
            } else if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    i = 1;
                }
                i = -1;
            } else {
                if (str.equals("email")) {
                    i = 2;
                }
                i = -1;
            }
            if (i == 0) {
                i9 = 1;
            } else if (i == 1) {
                i9 = 4;
            } else if (i != 2) {
                i9 = i5;
            }
            if (i9 != 0) {
                SpannableString spannableString = new SpannableString(charSequence3);
                if (Build.VERSION.SDK_INT < i6) {
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(i5, spannableString.length(), URLSpan.class);
                    for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
                        spannableString.removeSpan(uRLSpanArr[length]);
                    }
                    if ((i9 & 4) != 0) {
                        Linkify.addLinks(spannableString, 4);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    if ((i9 & 1) != 0) {
                        ksn.a(arrayList3, spannableString, kss.c, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
                    }
                    if ((i9 & 2) != 0) {
                        ksn.a(arrayList3, spannableString, kss.d, new String[]{"mailto:"}, r2);
                    }
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableString.getSpans(i5, spannableString.length(), URLSpan.class);
                    int length2 = uRLSpanArr2.length;
                    for (int i10 = i5; i10 < length2; i10++) {
                        URLSpan uRLSpan = uRLSpanArr2[i10];
                        ksm ksmVar = new ksm();
                        ksmVar.a = uRLSpan;
                        ksmVar.c = spannableString.getSpanStart(uRLSpan);
                        ksmVar.d = spannableString.getSpanEnd(uRLSpan);
                        arrayList3.add(ksmVar);
                    }
                    Collections.sort(arrayList3, ksn.a);
                    int size = arrayList3.size();
                    int i11 = i5;
                    while (true) {
                        int i12 = size - 1;
                        if (i11 >= i12) {
                            break;
                        }
                        ksm ksmVar2 = (ksm) arrayList3.get(i11);
                        int i13 = i11 + 1;
                        ksm ksmVar3 = (ksm) arrayList3.get(i13);
                        int i14 = ksmVar2.c;
                        int i15 = ksmVar3.c;
                        if (i14 <= i15 && (i2 = ksmVar2.d) > i15) {
                            int i16 = ksmVar3.d;
                            int i17 = (i16 > i2 && (i3 = i2 - i14) <= (i4 = i16 - i15)) ? i3 < i4 ? i11 : -1 : i13;
                            if (i17 != -1) {
                                URLSpan uRLSpan2 = ((ksm) arrayList3.get(i17)).a;
                                if (uRLSpan2 != null) {
                                    spannableString.removeSpan(uRLSpan2);
                                }
                                arrayList3.remove(i17);
                                size = i12;
                            }
                        }
                        i11 = i13;
                    }
                    if (arrayList3.size() != 0) {
                        int size2 = arrayList3.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            ksm ksmVar4 = (ksm) arrayList3.get(i18);
                            if (ksmVar4.a == null) {
                                spannableString.setSpan(new URLSpan(ksmVar4.b), ksmVar4.c, ksmVar4.d, 33);
                            }
                        }
                    } else {
                        r2 = 0;
                        i5 = 0;
                        i6 = 28;
                    }
                } else if (Linkify.addLinks(spannableString, i9)) {
                }
                for (URLSpan uRLSpan3 : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                    exag.b(spannableString.getSpanStart(uRLSpan3), spannableString.getSpanEnd(uRLSpan3), Collections.singletonMap(str, Float.valueOf(1.0f)), arrayList2);
                }
                i5 = 0;
                r2 = 0;
                i6 = 28;
            }
        }
        return exag.a(charSequence3, arrayList2, r2);
    }
}
