package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcws implements byzp {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;

    public bcws(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
        ffbrVar10.getClass();
        this.j = ffbrVar10;
        ffbrVar11.getClass();
        this.k = ffbrVar11;
        ffbrVar12.getClass();
        this.l = ffbrVar12;
    }

    @Override // defpackage.byzp
    public final /* bridge */ /* synthetic */ MessageCoreData a() {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        ((cjic) this.f.b()).getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, this.g, this.h, this.i, this.j, bcwqVar);
    }

    @Override // defpackage.byzp
    public final /* bridge */ /* synthetic */ MessageCoreData b(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        parcel.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        ffbr ffbrVar = this.h;
        ffbr ffbrVar2 = this.i;
        ffbr ffbrVar3 = this.j;
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, parcel, ffbrVar, ffbrVar2, ffbrVar3, bcwqVar);
    }

    @Override // defpackage.byzp
    public final /* bridge */ /* synthetic */ MessageCoreData c(MessagesTable.BindData bindData, List list) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        ((cjic) this.f.b()).getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        bindData.getClass();
        list.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, this.g, this.h, this.i, this.j, bcwqVar, bindData, list);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData d(String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, conversationIdType, str2, selfIdentityId, str3, str4, j, j2, z, z2, i, str5);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, awui awuiVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, selfIdentityId, str, awuiVar);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, MessageCoreData messageCoreData) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        selfIdentityId.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, selfIdentityId, messageCoreData);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData g(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, selfIdentityId, str, str2, z);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData h(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, awui awuiVar, String str, String str2, UUID uuid) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        str2.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, selfIdentityId, awuiVar, str, str2, uuid);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData i(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        ((cjic) this.f.b()).getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, aquz.b(selfIdentityId), selfIdentityId, 3, 0, MessageData.aG(bcwzVar, str), (UUID) null);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData j(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, i, conversationIdType, selfIdentityId, (String) null);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData k(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, byzi byziVar, long j5) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        selfIdentityId.getClass();
        conversationIdType.getClass();
        byziVar.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, str2, selfIdentityId, conversationIdType, z, i, str3, str4, i2, str5, z2, z3, j, i3, j2, j3, j4, str6, byziVar, j5);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData l(Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        str.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, uri, conversationIdType, str, selfIdentityId, str2, str3, j, j2, z, z2, j3);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData m(String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        ((cjic) this.f.b()).getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, this.g, this.h, this.i, this.j, bcwqVar, str);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData n(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        str3.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, str2, selfIdentityId, conversationIdType, i, z, z2, j, j2, str3);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData o(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, i, conversationIdType, selfIdentityId, str);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData p(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        str.getClass();
        selfIdentityId.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, selfIdentityId, conversationIdType, i, j, str2);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData q(ConversationIdType conversationIdType, int i, long j) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.l, this.h, this.i, this.j, bcwqVar, conversationIdType, i, j);
    }

    @Override // defpackage.byzp
    public final /* bridge */ /* synthetic */ MessageCoreData r(ConversationIdType conversationIdType, String str, String str2, UUID uuid) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, str, str2, uuid);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData s(ConversationIdType conversationIdType, String str, UUID uuid) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        ((cjic) this.f.b()).getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, this.g, this.h, this.i, this.j, bcwqVar, conversationIdType, (String) null, (SelfIdentityId) null, 3, 0, MessageData.aG(bcwzVar, str), uuid);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData t(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, long j2, String str2, bdgr bdgrVar) {
        return v(str, selfIdentityId, conversationIdType, 100, false, false, j, j2, str2, bdgrVar);
    }

    @Override // defpackage.byzp
    public final /* bridge */ /* synthetic */ MessageCoreData u(String str, long j, long j2, bdhg bdhgVar, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, long j3, long j4, String str3, String str4) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        str2.getClass();
        str3.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, j, j2, bdhgVar, str2, selfIdentityId, conversationIdType, i, z, j3, j4, str3, str4);
    }

    public final MessageData v(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str2, bdgr bdgrVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, selfIdentityId, conversationIdType, i, z, z2, j, j2, str2, bdgrVar);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData w(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, cntb cntbVar, bdgr bdgrVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        String str = ((SelfIdentityIdImpl) selfIdentityId).a;
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, str, selfIdentityId, conversationIdType, i, j, j, cntbVar, bdgrVar);
    }

    @Override // defpackage.byzp
    public final /* synthetic */ MessageCoreData x(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, String str, bdgr bdgrVar) {
        return v(((SelfIdentityIdImpl) selfIdentityId).a, selfIdentityId, conversationIdType, 1, true, true, j, j, str, bdgrVar);
    }

    @Override // defpackage.byzp
    public final /* bridge */ /* synthetic */ MessageCoreData y(bdhg bdhgVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, String str2, boolean z, boolean z2, long j, long j2) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) this.c.b();
        bcwzVar.getClass();
        byzp byzpVar = (byzp) this.d.b();
        byzpVar.getClass();
        cjic cjicVar = (cjic) this.f.b();
        cjicVar.getClass();
        bcwq bcwqVar = (bcwq) this.k.b();
        bcwqVar.getClass();
        bdhgVar.getClass();
        str.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cqohVar, bcwzVar, byzpVar, this.e, cjicVar, this.g, this.h, this.i, this.j, bcwqVar, bdhgVar, str, selfIdentityId, conversationIdType, i, i2, str2, 0L, z, z2, j, j2);
    }
}
