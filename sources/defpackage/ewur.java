package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.NamedVariant;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.RemoteActionTemplate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewur {
    public static Bundle a(NamedVariant[] namedVariantArr) {
        if (namedVariantArr == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (NamedVariant namedVariant : namedVariantArr) {
            if (namedVariant != null) {
                switch (namedVariant.b) {
                    case 1:
                        bundle.putInt(namedVariant.a, namedVariant.c);
                        break;
                    case 2:
                        bundle.putLong(namedVariant.a, namedVariant.d);
                        break;
                    case 3:
                        bundle.putFloat(namedVariant.a, namedVariant.e);
                        break;
                    case 4:
                        bundle.putDouble(namedVariant.a, namedVariant.f);
                        break;
                    case 5:
                        bundle.putBoolean(namedVariant.a, namedVariant.g);
                        break;
                    case 6:
                        bundle.putString(namedVariant.a, namedVariant.h);
                        break;
                    case 7:
                        bundle.putStringArray(namedVariant.a, namedVariant.i);
                        break;
                    case 8:
                        bundle.putFloatArray(namedVariant.a, namedVariant.j);
                        break;
                    case 9:
                        bundle.putIntArray(namedVariant.a, namedVariant.k);
                        break;
                    default:
                        bundle.putBundle(namedVariant.a, a(namedVariant.l));
                        break;
                }
            }
        }
        return bundle;
    }

    public static final engw b(RemoteActionTemplate[] remoteActionTemplateArr) {
        if (remoteActionTemplateArr.length == 0) {
            int i = engw.d;
            return enou.a;
        }
        int i2 = engw.d;
        engr engrVar = new engr();
        for (RemoteActionTemplate remoteActionTemplate : remoteActionTemplateArr) {
            if (remoteActionTemplate == null) {
                ewuo.a("Invalid RemoteActionTemplate: is null");
            } else if (TextUtils.isEmpty(remoteActionTemplate.b) && TextUtils.isEmpty(remoteActionTemplate.a)) {
                ewuo.a("Invalid RemoteActionTemplate: title is null");
            } else if (TextUtils.isEmpty(remoteActionTemplate.c)) {
                ewuo.a("Invalid RemoteActionTemplate: description is null");
            } else if (!TextUtils.isEmpty(remoteActionTemplate.j)) {
                ewuo.a("Invalid RemoteActionTemplate: package name is set");
            } else if (TextUtils.isEmpty(remoteActionTemplate.e)) {
                ewuo.a("Invalid RemoteActionTemplate: intent action not set");
            } else {
                String str = remoteActionTemplate.a;
                String str2 = remoteActionTemplate.b;
                String str3 = remoteActionTemplate.c;
                String str4 = remoteActionTemplate.d;
                Intent intent = new Intent(remoteActionTemplate.e);
                intent.setDataAndType(TextUtils.isEmpty(remoteActionTemplate.f) ? null : Uri.parse(remoteActionTemplate.f).normalizeScheme(), TextUtils.isEmpty(remoteActionTemplate.g) ? null : Intent.normalizeMimeType(remoteActionTemplate.g));
                Integer num = remoteActionTemplate.h;
                intent.setFlags(num == null ? 0 : num.intValue());
                if (!TextUtils.isEmpty(remoteActionTemplate.j)) {
                    intent.setPackage(remoteActionTemplate.j);
                }
                String[] strArr = remoteActionTemplate.i;
                if (strArr != null) {
                    for (String str5 : strArr) {
                        if (str5 != null) {
                            intent.addCategory(str5);
                        }
                    }
                }
                intent.putExtras(a(remoteActionTemplate.k));
                if (!intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER")) {
                    intent.putExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER", Bundle.EMPTY);
                }
                Integer num2 = remoteActionTemplate.l;
                engrVar.h(new ewuq(str, str2, str3, str4, intent, num2 == null ? 0 : num2.intValue()));
            }
            ewuo.a("Invalid RemoteActionTemplate skipped.");
        }
        return engrVar.g();
    }
}
