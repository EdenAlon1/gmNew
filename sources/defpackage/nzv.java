package defpackage;

import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzv {
    public static final oab a(String str, String str2) {
        String str3;
        oab oabVar = oab.a;
        if (ffkj.e("integer", str)) {
            return oab.a;
        }
        if (ffkj.e("integer[]", str)) {
            return oab.c;
        }
        if (ffkj.e("List<Int>", str)) {
            return oab.d;
        }
        if (ffkj.e(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, str)) {
            return oab.e;
        }
        if (ffkj.e("long[]", str)) {
            return oab.f;
        }
        if (ffkj.e("List<Long>", str)) {
            return oab.g;
        }
        if (ffkj.e("boolean", str)) {
            return oab.k;
        }
        if (ffkj.e("boolean[]", str)) {
            return oab.l;
        }
        if (ffkj.e("List<Boolean>", str)) {
            return oab.m;
        }
        if (!ffkj.e("string", str)) {
            if (ffkj.e("string[]", str)) {
                return oab.o;
            }
            if (ffkj.e("List<String>", str)) {
                return oab.p;
            }
            if (ffkj.e("float", str)) {
                return oab.h;
            }
            if (ffkj.e("float[]", str)) {
                return oab.i;
            }
            if (ffkj.e("List<Float>", str)) {
                return oab.j;
            }
            if (ffkj.e("reference", str)) {
                return oab.b;
            }
            if (str.length() != 0) {
                try {
                    if (!ffpc.t(str, ".") || str2 == null) {
                        str3 = str;
                    } else {
                        str3 = str2 + str;
                    }
                    boolean n = ffpc.n(str, "[]");
                    if (n) {
                        str3 = str3.substring(0, str3.length() - 2);
                        str3.getClass();
                    }
                    Class<?> cls = Class.forName(str3);
                    cls.getClass();
                    oab nzxVar = Parcelable.class.isAssignableFrom(cls) ? n ? new nzx(cls) : new nzy(cls) : (!Enum.class.isAssignableFrom(cls) || n) ? Serializable.class.isAssignableFrom(cls) ? n ? new nzz(cls) : new oaa(cls) : null : new nzw(cls);
                    if (nzxVar != null) {
                        return nzxVar;
                    }
                    throw new IllegalArgumentException(a.v(str3, " is not Serializable or Parcelable."));
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return oab.n;
    }
}
