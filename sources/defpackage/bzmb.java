package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmb {
    public static final bzlv a(bzly bzlyVar) {
        bzlv bzlvVar = ((bzma) bzlyVar.instance).h;
        if (bzlvVar == null) {
            bzlvVar = bzlv.a;
        }
        bzlvVar.getClass();
        return bzlvVar;
    }

    public static final /* synthetic */ bzma b(bzly bzlyVar) {
        eyfy build = bzlyVar.build();
        build.getClass();
        return (bzma) build;
    }

    public static final void c(bzlv bzlvVar, bzly bzlyVar) {
        bzlyVar.copyOnWrite();
        bzma bzmaVar = (bzma) bzlyVar.instance;
        bzma bzmaVar2 = bzma.a;
        bzmaVar.h = bzlvVar;
        bzmaVar.b |= 2;
    }

    public static final void d(boolean z, bzly bzlyVar) {
        bzlyVar.copyOnWrite();
        bzma bzmaVar = (bzma) bzlyVar.instance;
        bzma bzmaVar2 = bzma.a;
        bzmaVar.j = z;
    }

    public static final void e(bzls bzlsVar, bzly bzlyVar) {
        bzlsVar.getClass();
        bzlyVar.copyOnWrite();
        bzma bzmaVar = (bzma) bzlyVar.instance;
        bzma bzmaVar2 = bzma.a;
        bzmaVar.e = bzlsVar;
        bzmaVar.b |= 1;
    }

    public static final void f(bzlz bzlzVar, bzly bzlyVar) {
        bzlzVar.getClass();
        bzlyVar.copyOnWrite();
        bzma bzmaVar = (bzma) bzlyVar.instance;
        bzma bzmaVar2 = bzma.a;
        bzmaVar.c = bzlzVar.a();
    }

    public static final /* synthetic */ void g(Iterable iterable, bzly bzlyVar) {
        bzlyVar.copyOnWrite();
        bzma bzmaVar = (bzma) bzlyVar.instance;
        bzma bzmaVar2 = bzma.a;
        eygr eygrVar = bzmaVar.f;
        if (!eygrVar.c()) {
            bzmaVar.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, bzmaVar.f);
    }

    public static final /* synthetic */ void h(Iterable iterable, bzly bzlyVar) {
        bzlyVar.copyOnWrite();
        bzma bzmaVar = (bzma) bzlyVar.instance;
        bzma bzmaVar2 = bzma.a;
        eygr eygrVar = bzmaVar.d;
        if (!eygrVar.c()) {
            bzmaVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, bzmaVar.d);
    }

    public static final void j(bzly bzlyVar) {
        DesugarCollections.unmodifiableList(((bzma) bzlyVar.instance).d).getClass();
    }
}
