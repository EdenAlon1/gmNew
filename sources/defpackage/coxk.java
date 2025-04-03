package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface coxk {
    public static final Uri a = Uri.parse("content://mms/part");
    public static final Uri b = Uri.parse("content://mms-sms/canonical-address");
    public static final Uri c = Uri.parse("content://mms-sms/threadID");

    elfl A();

    @Deprecated
    Optional B(long j);

    Optional C(cpxu cpxuVar);

    Optional D(cpbd cpbdVar, String str);

    String E(long j);

    @Deprecated
    String F(cpbd cpbdVar, String str);

    String G();

    @Deprecated
    String H(long j);

    String I(cpxu cpxuVar);

    String J();

    List K(String str);

    List L(String str);

    Map M();

    void N(Context context, Uri uri);

    void O(cno cnoVar);

    void P(long j, long j2);

    @Deprecated
    void Q(Uri uri, String str);

    void R(Uri uri, int i, long j);

    @Deprecated
    void S(long j, boolean z);

    void T(cpxu cpxuVar, boolean z);

    boolean U(long j, long j2);

    boolean V();

    boolean W(cpxu cpxuVar);

    boolean X(Context context, Uri uri, int i, long j);

    boolean Y(Uri uri, String str);

    String[] Z(Context context, ll llVar);

    int a(Uri uri, String str);

    lz aa(String[] strArr, MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, long j2, byte[] bArr);

    Uri ab(Context context, lx lxVar, int i, String str, long j, long j2, String str2, int i2);

    Uri ac(Context context, List list, MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, String str, long j2);

    void ad(long j, long j2);

    void ae(Uri uri);

    void af(Context context, Uri uri, long j);

    ckbx ag(Context context, Uri uri, ly lyVar);

    boolean ah(Uri uri, int i, long j);

    void ai(Uri uri, long j);

    void aj();

    void ak(List list);

    int b(long j);

    int c(ContentResolver contentResolver, String str, String str2);

    long d(Context context, String str);

    long e(Context context, Collection collection);

    long f(Context context, cotp cotpVar, String str);

    long g(Context context, cotp cotpVar, Collection collection);

    long h(Context context, cotp cotpVar, String str, ayvm ayvmVar);

    long i(Context context, cotp cotpVar, Collection collection, ayvm ayvmVar);

    long j(long j, long j2);

    Uri k(Context context, lx lxVar, int i, String str, long j, long j2, String str2);

    Uri l(Context context, lh lhVar, int i, String str, long j, Map map);

    Uri m(Context context, List list, MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, String str, long j2, byte[] bArr);

    Uri n(Context context, Uri uri, int i, String str, String str2, long j, int i2, int i3, cpxu cpxuVar, UUID uuid, Optional optional);

    Uri o(bdtd bdtdVar, MessageCoreData messageCoreData, long j);

    Uri p(bdtd bdtdVar, MessageCoreData messageCoreData);

    ckbx q(Context context, Uri uri, int i, String str, String str2, Uri uri2, boolean z, long j, Bundle bundle, long j2);

    ckbx r(Context context, Uri uri, int i, String str, String str2, String str3, boolean z, long j, lx lxVar, long j2);

    ckbx s(aoku aokuVar, String str, Uri uri, int i, String str2, boolean z, MessageIdType messageIdType, long j);

    cout t(Uri uri, int i);

    coux u(Uri uri);

    coxj v(Uri uri);

    @Deprecated
    cpbd w(long j, String str);

    cpbd x(cpxu cpxuVar, String str);

    @Deprecated
    cpbd y(cotp cotpVar, long j, String str);

    cpbd z(cotp cotpVar, cpxu cpxuVar, String str);
}
