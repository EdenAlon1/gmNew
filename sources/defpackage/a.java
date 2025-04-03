package defpackage;

import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class a {
    public static /* synthetic */ String A(String str, String str2, String str3, String str4, String str5) {
        return str + str3 + str2 + str4 + str5;
    }

    public static /* synthetic */ String B(int i, String str) {
        return i + str;
    }

    public static /* synthetic */ String C(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String D(long j, long j2, String str, String str2) {
        return str + j2 + str2 + j;
    }

    public static /* synthetic */ String E(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ String F(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String G(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String H(char c, String str, String str2) {
        return str + c + str2;
    }

    public static /* synthetic */ String I(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String J(ea eaVar, Class cls) {
        return "Attempt to inject a Fragment wrapper of type " + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(eaVar.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String L(View view) {
        return "TikTok View " + view.getClass().toString() + ", cannot be attached to a non-TikTok Fragment";
    }

    public static /* synthetic */ String N(Class cls, String str, String str2) {
        return str + cls.getName() + str2;
    }

    public static /* synthetic */ String O(owl owlVar, owl owlVar2, String str) {
        return str + owo.b(owlVar2) + "\n Found:\n" + owo.b(owlVar);
    }

    public static /* synthetic */ String P(euag euagVar, String str) {
        return str + euagVar.a();
    }

    public static /* synthetic */ String Q(String str, evpl evplVar, String str2, String str3) {
        return str2 + str + str3 + evplVar.f();
    }

    public static /* synthetic */ String R(KeySpec keySpec, String str) {
        return str + String.valueOf(keySpec.getClass()) + ".";
    }

    public static /* synthetic */ String S(Key key, String str) {
        return str + String.valueOf(key.getClass()) + ".";
    }

    public static /* synthetic */ String a(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String b(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String c(Object obj, Object obj2, String str, String str2) {
        return str + obj2.toString() + str2 + obj.toString();
    }

    public static /* synthetic */ String d(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String e(int i, String str, SparseIntArray sparseIntArray) {
        return str + Integer.toHexString(i) + "   " + sparseIntArray.get(i);
    }

    public static /* synthetic */ String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String g(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static /* synthetic */ String h(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String i(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String j(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String k(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String l(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String m(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String n(Object obj, String str) {
        return str + obj;
    }

    public static /* synthetic */ String o(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ String q(boolean z, String str) {
        return str + z;
    }

    public static /* synthetic */ String r(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String s(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String t(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String u(Class cls) {
        return cls.getCanonicalName() + "-" + UUID.randomUUID();
    }

    public static /* synthetic */ String v(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String w(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String x(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String y(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String z(int i, String str, String str2, String str3) {
        return str2 + str + str3 + i;
    }
}
