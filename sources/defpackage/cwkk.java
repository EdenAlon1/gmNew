package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwkk implements cpff {
    final /* synthetic */ ciqz a;
    final /* synthetic */ ParticipantsTable.BindData b;
    final /* synthetic */ cvfe c;

    public cwkk(ciqz ciqzVar, ParticipantsTable.BindData bindData, cvfe cvfeVar) {
        this.a = ciqzVar;
        this.b = bindData;
        this.c = cvfeVar;
    }

    @Override // defpackage.cpff
    public final bduq a() {
        return ((ciqy) this.a).f;
    }

    @Override // defpackage.cpff
    public final Object b(ffgu ffguVar) {
        return Boolean.valueOf(((ciqy) this.a).c);
    }

    @Override // defpackage.cpff
    public final /* synthetic */ Object c(ffgu ffguVar) {
        return cpfa.a(this, ffguVar);
    }

    @Override // defpackage.cpff
    public final /* synthetic */ Object d(ffgu ffguVar) {
        return cpfa.b(this, ffguVar);
    }

    @Override // defpackage.cpff
    public final Object e(ffgu ffguVar) {
        ParticipantsTable.BindData bindData = this.b;
        return Boolean.valueOf(aoqw.j(bindData != null ? bindData.U() : null));
    }

    @Override // defpackage.cpff
    public final /* synthetic */ Object f(ffgu ffguVar) {
        return cpfa.c(this, ffguVar);
    }

    @Override // defpackage.cpff
    public final Object g(ffgu ffguVar) {
        return Boolean.valueOf(cpff.e.a(this.c, this.b));
    }

    @Override // defpackage.cpff
    public final boolean h() {
        return false;
    }

    @Override // defpackage.cpff
    public final boolean i() {
        return true;
    }

    @Override // defpackage.cpff
    public final Object j() {
        return this.b;
    }
}
