import { TestBed } from '@angular/core/testing';

import { ProductmanagementServiceService } from './productmanagement-service.service';

describe('ProductmanagementServiceService', () => {
  let service: ProductmanagementServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductmanagementServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
