package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffkj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CategoriesResponse {
    private final List<Category> tags;

    public CategoriesResponse(List<Category> list) {
        list.getClass();
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoriesResponse copy$default(CategoriesResponse categoriesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = categoriesResponse.tags;
        }
        return categoriesResponse.copy(list);
    }

    public final List<Category> component1() {
        return this.tags;
    }

    public final CategoriesResponse copy(List<Category> list) {
        list.getClass();
        return new CategoriesResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoriesResponse) && ffkj.e(this.tags, ((CategoriesResponse) obj).tags);
    }

    public final List<Category> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return this.tags.hashCode();
    }

    public String toString() {
        return "CategoriesResponse(tags=" + this.tags + ")";
    }
}
